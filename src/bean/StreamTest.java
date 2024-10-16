package bean;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {


        String str="swiss";
        Character key = str.chars().mapToObj(s -> Character.valueOf(Character.toLowerCase((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() == 1).findFirst().get().getKey();
        System.out.println("First Non-repeated Char is : "+key);

    }

}
