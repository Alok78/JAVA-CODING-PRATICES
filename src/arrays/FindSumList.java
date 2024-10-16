package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSumList
{
    public static void main(String[] args)
    {
        int arr[] = { 8, 7, 2, 5, 3, 1 };
        int target=10;
        findPairs(arr,target);
    }
    public static int[] getsSum(int[] nums,int target)
    {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=n;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{};
    }



    public static void findPairs(int arr[], int sum){
        //int[][] arrays =new int[10][] ;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        //int pairsarr [][] = new int[arr.length][arr.length];
        for (int i = 0; i<arr.length;i++){
            if(map.containsKey(sum - arr[i])){
                System.out.println(" Pair is found : ("+arr[map.get(sum-arr[i])]+": "+(arr[i])+" )");
            }else{
                map.put(arr[i], i);
            }
        }
    }
 }
