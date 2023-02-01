package z_lld.inmemoryrdbms;

import z_lld.inmemoryrdbms.DataStore.TableHeader;
import z_lld.inmemoryrdbms.service.DataStoreService;

import java.util.Arrays;
import java.util.List;

public class InMemoryRDBMSMain {
    public static void main(String[] args)  {
        DataStoreService dataStoreService = new DataStoreService();
        String tableName= "User";
        TableHeader nameTableHeader = new TableHeader("name", "String",false, TableHeader.Constrant.STRING_20_LEN);
        TableHeader ageTableHeader = new TableHeader("age", "int",false, TableHeader.Constrant.INT_RANGE_1024);

        List<TableHeader> Headers = Arrays.asList(nameTableHeader,ageTableHeader);
        try {
            dataStoreService.createTable(tableName,Headers);
            dataStoreService.insertEntryinTable("User", Arrays.asList("Prashrgfgtrtrtrtrtrtrttrtrant",24));
            dataStoreService.insertEntryinTable("User", Arrays.asList("Rahul",12));
            System.out.println(dataStoreService.geAllRows("User"));
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

    }
}
