package z_lld.inmemoryrdbms.DataStore;

import java.sql.Timestamp;
import java.util.*;

public class Table {
    private String tableName;
    private static int nextRowId;
    private List<TableHeader> headerList;
    private List<TableRow> rows;
    private Timestamp createdOn;

    public Table(String tableName, List<TableHeader> headerList) {
        this.tableName = tableName;
        this.headerList = headerList;
        nextRowId=0;
        this.createdOn= new Timestamp(System.currentTimeMillis());
        this.rows = new ArrayList<>();
    }

    public int insertRowInTable(List<Object> values) throws Exception {
        validateRow(values);
        nextRowId++;
        Map<String, Object> rowValues = new HashMap<>();
        for(int i=0;i<values.size();i++){
            rowValues.put(headerList.get(i).getColunmName(),values.get(i));
        }
        TableRow row = new TableRow(nextRowId,rowValues);
        rows.add(row);
        return nextRowId;
    }
    public boolean deleteRowInTable(int rowId){
        return false;
    }
    public void validateRow(List<Object> values) throws Exception{
        for(int i=0;i<values.size();i++){
            TableHeader currentHeader = headerList.get(i);
            Object value = values.get(i);
            switch (currentHeader.getConstrant()){
                case  STRING_20_LEN :
                    String val = value.toString();
                    if(val.length()>20){
                        throw  new Exception("Invalid Length for String Data");
                    }
                    break;
                case INT_RANGE_1024:
                    int intVal = (int) value;
                    if(intVal < -1024 || intVal > 1024){
                        throw  new Exception("Invalid Value for Int Data");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public String getTableName() {
        return tableName;
    }

    public Table setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public static int getNextRowId() {
        return nextRowId;
    }

    public static void setNextRowId(int nextRowId) {
        Table.nextRowId = nextRowId;
    }

    public List<TableHeader> getHeaderList() {
        return headerList;
    }

    public Table setHeaderList(List<TableHeader> headerList) {
        this.headerList = headerList;
        return this;
    }

    public List<TableRow> getRows() {
        return rows;
    }

    public Table setRows(List<TableRow> rows) {
        this.rows = rows;
        return this;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public Table setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
        return this;
    }
}
