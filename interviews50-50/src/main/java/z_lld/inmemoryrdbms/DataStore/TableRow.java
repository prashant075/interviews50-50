package z_lld.inmemoryrdbms.DataStore;

import java.sql.Timestamp;
import java.util.Map;

public class TableRow {
    private static int rowId;
    private Map<String, Object> values;
    private Timestamp createdOn;
    private Timestamp lastUpdatedOn;

    public TableRow(int rowId, Map<String, Object> values) {
        this.rowId = rowId;
        this.values = values;
    }

    public static int getRowId() {
        return rowId;
    }

    public static void setRowId(int rowId) {
        TableRow.rowId = rowId;
    }

    public Map<String, Object> getValues() {
        return values;
    }

    public TableRow setValues(Map<String, Object> values) {
        this.values = values;
        return this;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public TableRow setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public Timestamp getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public TableRow setLastUpdatedOn(Timestamp lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
        return this;
    }

    @Override
    public String toString() {
        return "TableRow{" +
                "values=" + values +
                ", createdOn=" + createdOn +
                ", lastUpdatedOn=" + lastUpdatedOn +
                '}';
    }
}
