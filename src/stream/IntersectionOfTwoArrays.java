package stream;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays
{
    public static void main(String[] args) {
        int firstArray[]={2,4,3,6,8,6,4,1};
        int secondArray[]={3,8,9};

        Arrays.stream(firstArray).filter(x -> Arrays.stream(secondArray).anyMatch(y -> y==x)).distinct()
                .forEach(System.out::println);

        String[] arr1={"Java","Python","Devops","Scala"};
        String[] arr2={"Java","Scala"};
        //Usinhg Java 8
        Arrays.stream(arr1).filter(str-> Arrays.stream(arr2).anyMatch(str1 -> str1==str))
                .distinct().forEach(System.out::println);

        //Using Java 7
        HashSet<String> output = new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    output.add(arr1[i]);
                    break;
                }
            }
        }
        for(String s: output)
        {
            System.out.println("Using Java 7 :  "+s);
        }
    }
}
