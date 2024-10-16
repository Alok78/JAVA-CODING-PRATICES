package test;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestThread {

    public static void main(String[] args) {

        String string = "Persistent";
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character ch:string.toCharArray())
        {
            map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        }
        Character key = map.entrySet().stream().filter(s -> s.getValue() == 1).findFirst().get().getKey();
        //System.out.println("First Non-Repeated character is : -"+key);
        Character ch = string.chars().mapToObj(s -> Character.valueOf(Character.toLowerCase((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(m -> m.getKey()).findFirst().get();
        System.out.println("First Non-Repeated character is : -"+ch);


        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(new Employee(1,"Alok",22000,33));
        empList.add(new Employee(2,"Sameer",25000,32));
        empList.add(new Employee(3,"Atul",20000,30));
        empList.add(new Employee(4,"Prakash",29000,35));
        empList.add(new Employee(5,"Deepak",30000,31));

        List<Employee> emp = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(2).skip(1).collect(Collectors.toList());
        emp.forEach(System.out::println);



    }
}
