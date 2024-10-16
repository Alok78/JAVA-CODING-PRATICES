package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingSort {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Vijay Reddy", 30000),
                new Employee("Amit Shah", 60000),
                new Employee("Sara Khan", 50000),
                new Employee("Amit Shah", 40000)
        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName, Comparator.reverseOrder())
                        .thenComparing(Employee::getSalary, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        sortedEmployees.forEach(System.out::println);
    }
}
