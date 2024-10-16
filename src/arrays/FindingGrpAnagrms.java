package arrays;

import java.lang.reflect.Array;
import java.util.*;




/**
 * Tow sum with all approaches
 * Buy and Sell stock
 * Target Sum
 * LRU cache
 * Merge intervals
 * Detect cycle
 * Maximum sub-array
 * Number of islands
 * Path with minimum efforts
 * Trapping rain water
 * **/

public class FindingGrpAnagrms {

    public static void main(String[] args) {
        String[] str={"eat","tea","cat","tta"};
        List<List<String>> lists = groupAnagrams(str);
        lists.forEach(System.out::println);
    }
    public static List<List<String>> grpAngrs(String[] a)
    {
        List<List<String>> result=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:a)
        {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key=new String(charArray);
            if(map.containsKey(key))
            {
                map.get(key).add(str);
            }
            else{
                List<String> strList=new ArrayList<>();
                strList.add(str);
                map.put(key,strList);
            }
        }
        result.addAll(map.values());
        return result;
    }




    public static  List<List<String>> groupAnagrams(String[] strs) {
            if (strs.length == 0) return new ArrayList();
            Map<String, List> ans = new HashMap<String, List>();
            for (String s : strs) {
                char[] ca = s.toCharArray();
                Arrays.sort(ca);
                String key = String.valueOf(ca);
                if (!ans.containsKey(key)) ans.put(key, new ArrayList());
                ans.get(key).add(s);
            }
            return new ArrayList(ans.values());
        }


//Time Complexity: O(NKlogK), where N is the length of strs, and K is the maximum length of a string in strs.
//The outer loop has complexity O(N) as we iterate through each string. Then, we sort each string in O(KlogK) time.
}
