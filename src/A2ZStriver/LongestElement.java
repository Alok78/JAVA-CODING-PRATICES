package A2ZStriver;

public class LongestElement {

    public static void main(String[] args) {
        int arr[]={2,5,4,3,1,8,6,9};
        int largestElement = findLargestElement(arr);
        System.out.println(largestElement);
    }

    public static int findLargestElement(int[] a)
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
}
