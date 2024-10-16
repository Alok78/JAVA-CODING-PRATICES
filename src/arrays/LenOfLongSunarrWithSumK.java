package arrays;

import java.util.HashMap;

public class LenOfLongSunarrWithSumK {

    public static void main(String[] args) {

        int a[]={10,5,2,7,1,9};
        int n=a.length;
        int k=15;
        System.out.println("Length = : "+lenOfLongSubarr(a,n,k));
    }

    public static int lenOfLongSubarr(int a[],int n,int k)
    {
        HashMap<Integer,Integer> sum_index_map=new HashMap<>();
        int maxLen=0;
        int prefix_sum=0;
        for(int i=0;i<n;i++)
        {                       //{10,5,2,7,1,9};
            prefix_sum+=a[i];
            if(prefix_sum==k)
            {
                maxLen=i+1;
            } else if (sum_index_map.containsKey(prefix_sum-k)) {

                maxLen=Math.max(maxLen,i-sum_index_map.get(prefix_sum-k));
            }
            if(!sum_index_map.containsKey(prefix_sum))
            {
                sum_index_map.put(prefix_sum,i);
            }

        }
        System.out.println(sum_index_map.keySet().toString());
        return maxLen;
    }
}
