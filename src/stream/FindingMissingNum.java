package stream;

import java.util.Arrays;

public class FindingMissingNum
{
    public static void main(String[] args) {

        int[] arr={4,6,8};
        int res=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==res)
            {
                res++;
            }
            else{
                System.out.println("Smallest missing number is : "+res);
                break;
            }
        }
    }
}
