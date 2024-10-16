package stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {

        List<Integer> numbers=Arrays.asList(1, 5, 3, 8, 4, 6, 12, 7, 9);
        int min=numbers.stream().min((x,y) -> x - y).get();
        System.out.println(min);

        int max=numbers.stream().reduce((x,y) -> x>y?x:y).get();
        System.out.println(max);

        long count=numbers.stream().count();
        System.out.println(count);
    }
}
