package gun03;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class StepdefsGun03 {
    @Given("my list {int}")
    public void myList(int num, DataTable table) {
        List<Integer> list = table.asList(Integer.class);
        System.out.println(num);
        System.out.println(list);
        for ( int s : list) {
            System.out.println(s+" , "+(s*s));
        }
    }

    @Then("conclution")
    public void conclution() {
    }

    @Given("my lists, list of lists")
    public void myListsListOfLists(DataTable table) {
        List<List<Object>> lists = table.asLists(Object.class);

        for (List<Object> list : lists) {
            System.out.println(list);
        }
    }


    @Given("my map")
    public void myMap(DataTable table) {
        Map<String, Integer> map = table.asMap(String.class, Integer.class);

        System.out.println(map);

        System.out.println(map.get("key1"));
    }

    @Given("my maps, list of maps")
    public void myMapsListOfMaps(DataTable table) {
        List<Map<String, Integer>> maps = table.asMaps(String.class, Integer.class);
        for (Map<String, Integer> map : maps) {
            System.out.println(map.get("key1"));
        }
    }
}
