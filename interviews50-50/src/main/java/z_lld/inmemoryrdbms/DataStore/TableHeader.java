package z_lld.inmemoryrdbms.DataStore;

public class TableHeader {
    public enum Constrant {
        STRING_20_LEN,
        INT_RANGE_1024;
    }
    public  enum  Type{
        STRING,
        INT
    }
    private String colunmName;
    private String type;
    private Boolean isNullable;
    private Constrant constrant;


    public TableHeader(String columnName, String type, Boolean isNullable, Constrant constrant) {
        this.colunmName = columnName;
        this.type = type;
        this.isNullable = isNullable;
        this.constrant = constrant;
    }

    public String getColunmName() {
        return colunmName;
    }

    public TableHeader setColunmName(String colunmName) {
        this.colunmName = colunmName;
        return this;
    }

    public String getType() {
        return type;
    }

    public TableHeader setType(String type) {
        this.type = type;
        return this;
    }

    public Boolean getNullable() {
        return isNullable;
    }

    public TableHeader setNullable(Boolean nullable) {
        isNullable = nullable;
        return this;
    }

    public Constrant getConstrant() {
        return constrant;
    }

    public TableHeader setConstrant(Constrant constrant) {
        this.constrant = constrant;
        return this;
    }
}
