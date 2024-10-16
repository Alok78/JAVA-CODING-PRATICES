package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharWithOccurance
{
    public static void main(String[] args)
    {
        String str="Java";
        displayDuplicate(str);
        displayDuplicateUsingJava8(str);
    }
    public static void displayDuplicateUsingJava8(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(Character ch: chars)
        {
            map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        }
        System.out.println(map.entrySet().stream().filter(s -> s.getValue()>1).findFirst().get().getKey());
    }


    public static void displayDuplicate(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c: chars)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for(Map.Entry<Character,Integer> entry:entries)
            {
                if(entry.getValue()>1)
                {
                    System.out.printf("%s  :  %d  %n",entry.getKey(),entry.getValue());
                }
            }

        }
    }
}
