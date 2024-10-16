import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxRep {

    public static void main(String[] args) {

        //ind the maximum occurring character in given String
        // -- "The brown lazy fox is running late."

        String str="The brown lazy fox is running late";
        String s = str.replaceAll("\\s", "");
        Character key = s.chars().mapToObj(c -> Character.valueOf(Character.toLowerCase((char) c))).
                collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();


        System.out.println(key);
    }
}
