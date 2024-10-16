package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfWordsInASent
{
    static  void count(String s)
    {
        char[] ch = s.toCharArray();
        for(int i= 0;i<ch.length;i++)
        {
            String st="";
            while(i<ch.length && ch[i] !=' ')
            {
                st=st+ch[i];
                i++;
            }
            if(st.length()>0)
            {
                System.out.println(st + "->" + st.length());
            }
        }
    }
    public static void main(String[] args) {
        String str="Hello World!!";
        //count(str);


        List<String> strList = Arrays.asList("a", "ab", "c", "Hello", "World", "Sentence", "Education");
        Map<Integer, List<String>> collect = strList.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(collect);

        count(str);
    }
}
