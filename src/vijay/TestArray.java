package vijay;

import java.util.*;
import java.util.stream.Collectors;

public class TestArray {

    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("a",2);
        map.put("b",1);
        map.put("c",5);
        map.put("d",3);
        map.put("e",6);

        Map<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,LinkedHashMap::new));
        System.out.println(map);


        int a[]={1,2,3};
        int b[]={2,4,6};
        List<Integer> diff = getDiff(a, b);
        System.out.println(diff);




    }
    public static List<Integer> getDiff(int[] arr, int[] arr1)
    {


        List<Integer> collect = Arrays.stream(arr).filter(a -> Arrays.stream(arr1).noneMatch(b -> b == a)).boxed().collect(Collectors.toList());

        return collect;
    }
}
