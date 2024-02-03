package model;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetData {

    public static final int CONSTANT = 0;

    public List<TestData> setData(DataTable dataTable) {

        List<TestData> credentials = new ArrayList<>();

        List<Map<String, String>> mapInfo = dataTable.asMaps();

        for (Map<String, String> map : mapInfo) {

            credentials.add(new ObjectMapper().convertValue(map, TestData.class));
        }
        return credentials;
    }

}