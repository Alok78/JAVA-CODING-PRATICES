import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        String input = "Hello";


        input.chars().mapToObj(c -> (char) c).sorted()
                .distinct().forEach(System.out::println);


        int[] a={1,5,6,8};
        Arrays.sort(a);
        IntStream.rangeClosed(1,a.length-1).sum();

        System.out.println("==================================");
        Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]})
                .limit(10).map(f->f[0])
                .forEach(System.out::println);
    }
}




