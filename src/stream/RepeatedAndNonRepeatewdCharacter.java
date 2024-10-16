package stream;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedAndNonRepeatewdCharacter
{
    public static void main(String[] args) {

        String str="Hello World";
        LinkedHashMap<Character, Long> charCount = str.chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        Optional<Character> firstNonRepatedChar = charCount.entrySet().stream().filter(e -> e.getValue() == 1)
                .map(e1 -> e1.getKey()).findFirst();

        Optional<Character> firstRepatedChar = charCount.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(e1 -> e1.getKey()).findFirst();

        if(firstNonRepatedChar.isPresent())
        {
            System.out.println("First Non Repeated Char is : "+firstNonRepatedChar.get());
        }
        System.out.println("First  Repeated Char is : "+firstRepatedChar.orElse(null));

        long count = str.chars().mapToObj(s -> (char) s).count();
        System.out.println(count);


    }

}
