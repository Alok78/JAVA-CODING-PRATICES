package vijay;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SmallestElement {

    public static void main(String[] args) {

        int arr[]={2,2,4,3,6,8};
        int size = arr.length;
        Arrays.sort(arr);
        int i = secondSamllest(arr, size);
        System.out.println("Second smallest is :-"+i);

    }
    public static int secondSamllest(int arr[],int n)
    {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<small)
            {
                second_small=small;
                small=arr[i];
            } else if (arr[1]<second_small && arr[i]!=small) {
                second_small=arr[i];
            }
        }
        return second_small;
    }

}