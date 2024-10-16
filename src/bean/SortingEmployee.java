package bean;

import java.util.*;
import java.util.stream.Collectors;

public class SortingEmployee
{
    public static void main(String[] args) {

        Employee e=new Employee(1,"Alok",4500,"CNB","Male");
        Employee e1=new Employee(2,"Alok",4400,"CNB","Male");
        Employee e2=new Employee(3,"Sandeep",1452,"LKO","Male");
        Employee e3=new Employee(4,"Deepak",12000,"NOI","Male");
        Employee e4=new Employee(4,"Rani",12000,"DLI","Female");
        Employee e5=new Employee(4,"Pooja",12000,"LKO","Female");
        Employee e6=new Employee(4,"Jyoti",12000,"CNB","Female");

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);


        List<Employee> empSort = empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(empSort);
        System.out.println("=============Maxmimum Salary Emp===========");


        Optional<Employee> minSal = empList.stream()
                .max(Comparator.comparing(Employee::getSalary));

        System.out.println("Maxmium Salary is : -"+minSal.get());

        System.out.println("-----------------------------------------");

        List<Employee> incSalary = empList.stream().map(em -> {

            if (em.getCity().equalsIgnoreCase("cnb")) {
                em.setSalary(em.getSalary() + 100);
            }
            return em;
        }).collect(Collectors.toList());

        System.out.println(incSalary);
        System.out.println("------------------------------------");

        Map<String, Employee> empCity = empList.stream()
                .collect(Collectors.groupingBy(Employee::getCity,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get))

                );

        System.out.println(empCity);
        System.out.println("==================================================///////////");

        Map<String, Long> newEmpList = empList.stream().filter(emp -> emp.getCity().equalsIgnoreCase("CNB"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(newEmpList);

    }
}
