package stream;

import java.util.HashMap;

public class PrintPyrimid
{
    public static void main(String[] args) {

        printTriangle(5);
        String str="Testing Program is Testing Program";
        printDuplicateWord(str);

    }
    public static void printTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static  void printDuplicateWord(String str)
    {
        HashMap<String, Integer> out = new HashMap<>();
        String[] inputArr = str.split(" ");
        for(String word:inputArr)
        {
            Integer oldCount = out.get(word);
            if(oldCount==null)
            {
                oldCount=0;
            }
            out.put(word,oldCount+1);
        }
        out.forEach((k,y) -> System.out.println(k+ "  "+y));
    }
}
