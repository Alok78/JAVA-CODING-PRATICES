package bean;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringComp
{
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",5);
        map.put("c",3);

        System.out.println("Befor Sorting");
        System.out.println(map);
        LinkedHashMap<String, Integer> SortedMap = map.entrySet().stream().sorted((e1, e2) -> {
            return e1.getValue() - e2.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("After Sorting");
        System.out.println(SortedMap);


    }
}
