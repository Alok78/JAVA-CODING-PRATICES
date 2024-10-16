package vijay;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorTest {

    public static void main(String[] args) {

        ArrayList<Emp> empList=new ArrayList<>();
        empList.add(new Emp("Alok",33));
        empList.add(new Emp("Test",32));
        empList.add(new Emp("Vaibhav",23));
        empList.add(new Emp("Minu",29));


        List<Emp> employeeList = empList.stream().sorted(Comparator.comparing(Emp::getName)).collect(Collectors.toList());

        employeeList.forEach(System.out::println);;

        HashMap<String,Integer> map=new HashMap<>();
        map.put("Alok",33);
        map.put("Binu",31);
        map.put("Vibhor",28);
        map.put("Vikash",29);
        map.put("Kishan",25);

        LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));

        System.out.println(collect);


    }
}
