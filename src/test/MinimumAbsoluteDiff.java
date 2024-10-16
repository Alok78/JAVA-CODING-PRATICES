package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDiff {

    public static List<List<Integer>> minAbsDiffPair(int [] arr)
    {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> pairs=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if(diff<minDiff)
            {
                minDiff=diff;
                pairs.clear();;
                pairs.add(Arrays.asList(arr[i],arr[i+1]));
            } else if (diff==minDiff) {
                pairs.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,10};
        List<List<Integer>> lists = minAbsDiffPair(arr);
        for(List<Integer> list:lists)
        {
            System.out.println(list);
        }
    }


}
