package A2ZStriver;

public class SecondLargestAndSmallest {

    public static void main(String[] args) {

        int[] arr={2,5,4,9,6,3};
        int i = secondSmallest(arr);
        System.out.println("Second Smallest is : "+i);
        int j = secondLargest(arr);
        System.out.println("Second Largest is : "+j);
    }

    public static int secondSmallest(int[] a)
    {
        int len=a.length;
        if(len<2)
            return -1;
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        for(int i=0;i<len;i++)
        {
            if(a[i]<small)
            {
                second_small=small;
                small=a[i];
            } else if (a[i]<second_small && a[i]!=small) {
                second_small=a[i];
            }
        }
        return second_small;
    }

    public static int secondLargest(int[] b)
    {
        int len=b.length;
        if(len<2)
            return -1;
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            if(b[i]>large)
            {
                second_large=large;
                large=b[i];
            } else if (b[i]>second_large && b[i] != large) {
                second_large=b[i];
            }
        }
        return second_large;
    }
}
