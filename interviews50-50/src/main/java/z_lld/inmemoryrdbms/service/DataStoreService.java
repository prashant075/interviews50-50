package z_lld.inmemoryrdbms.service;

import z_lld.inmemoryrdbms.DataStore.Table;
import z_lld.inmemoryrdbms.DataStore.TableHeader;
import z_lld.inmemoryrdbms.DataStore.TableRow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStoreService {
    Map<String, Table> allTables;

    public DataStoreService(){
        allTables = new HashMap<>();
    }

    public void createTable(String name, List<TableHeader> headerList) throws Exception {
        if(allTables.containsKey(name)){
            throw  new Exception("Table Already Present with this Name");
        }
        Table newTable = new Table(name,headerList);
        allTables.put(name,newTable);

    }
    public  void insertEntryinTable(String name, List<Object> values) throws Exception {
        if(!allTables.containsKey(name)){
            throw  new Exception("Table Not Present with this Name");
        }
        Table insertTable = allTables.get(name);
        insertTable.insertRowInTable(values);
    }
    public  List<TableRow> geAllRows(String name) throws Exception {
        if(!allTables.containsKey(name)){
            throw  new Exception("Table Not Present with this Name");
        }
       return allTables.get(name).getRows();
    }

}
