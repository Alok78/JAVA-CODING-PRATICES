package stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Occurance {
    public static void main(String[] args)
    {
        int a=121234555;

        findOcc(a);

        String str="Sandeep";
        countChar(str);
    }

    public static void findOcc(int num)
    {
        HashMap<Integer, Integer> digitCount = new HashMap<>();
        while(num !=0)
        {
            int lastDigit = num % 10;
            /*if(digitCount.containsKey(lastDigit))
            {
                digitCount.put(lastDigit,digitCount.get(lastDigit)+1);
            }
            else
            {
                digitCount.put(lastDigit,1);
            }*/
            digitCount.put(lastDigit,digitCount.containsKey(lastDigit)?digitCount.get(lastDigit)+1:1);
            num = num /10;
        }
        System.out.println("===================================================");
        System.out.println("Digit   :  Frequency");
        System.out.println("============================================");
        Set<Integer> entries = digitCount.keySet();
        for(Integer key :entries)
        {
            System.out.println("   "+key+"   :   "+digitCount.get(key));
        }

    }

    public static void countChar(String str)
    {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for(Character ch:str.toCharArray())
        {
            map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        }
        map.entrySet().forEach(System.out::println);
    }

}
