package test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveSuplicate
{
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(2, 4, 5, 8, 2, 3, 5);
        Set<Integer> newLisy = intList.stream().collect(Collectors.toSet());

        newLisy.forEach(System.out::println);


    }
}
