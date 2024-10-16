package stream;

import javax.xml.transform.stream.StreamSource;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDemo
{
    public static void main(String[] args) {
        String s=new String("Alok");
        String s1=new String("Alok");

        System.out.println(s==s1);
        System.out.println(s.equals(s1));


        StringBuffer sb=new StringBuffer("Alok");
        StringBuffer sb1=new StringBuffer("Alok");

        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));

        reverseString(s);
    }

    public static void reverseString(String str)
    {
        String res="";
        char[] chars = str.toCharArray();
        for(int i=chars.length-1;i>=0;i--)
        {
            res=res+chars[i];

        }
        System.out.println("Result is  : "+res);

        String res1=new StringBuffer(str).reverse().toString();
        System.out.println("Using String Buffer : "+res1);
        String res2 = Stream.of(str).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(""));
        System.out.println("Using Java 8 Stream : "+res2);
    }
}
