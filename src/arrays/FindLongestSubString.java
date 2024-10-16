package arrays;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindLongestSubString {

    public static void main(String[] args) {

        String str="ababc";
        int longest = getLongest(str);
        System.out.println(longest);
        longestSubStringUsingMap(str);

    }
    public static int getLongest(String str)
    {
        int length = str.length();
        int maxLen=0;
        Set<Character> charset=new LinkedHashSet<>();
        int left=0;
        for(int right=0;right<length;right++)
        {
            if(!charset.contains(str.charAt(right)))
            {
                charset.add(str.charAt(right));
                maxLen=Math.max(maxLen,right-left+1);
            }
            else {
                while (charset.contains(str.charAt(right)))
                {
                    charset.remove(str.charAt(left));
                    left++;
                }
                charset.add(str.charAt(right));
            }
        }
        return maxLen;
    }

    public static void longestSubStringUsingMap(String s)
    {
        String longestStr="";
        int longestSubStrLength=0;
        Map<Character,Integer> map=new LinkedHashMap<>();
        char[] charArray = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char ch=charArray[i];
            if(!map.containsKey(ch))
            {
                map.put(ch,i);
            }
            else{
                i=map.get(ch);
                map.clear();
            }
            if(map.size()>longestSubStrLength)
            {
                longestSubStrLength=map.size();
                longestStr=map.keySet().toString();
                System.out.println("VALUE - IS " +longestStr.replace(",",""));

            }
        }
        System.out.println("The Longest Sub-String is : "+longestStr);
        System.out.println("The Longet sub-string length is : "+longestSubStrLength);
    }
}
