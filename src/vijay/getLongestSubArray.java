package vijay;

public class getLongestSubArray {

    public static void main(String[] args) {

        int a[]={2, 3, 5, 1, 9};
        long k=10;
        int len = getLongestSubArrayUsingTwoPointer(a, k);
        System.out.println("The length of the longest subarray is: " + len);

    }
    public static int getLongestSubArrayUsingTwoPointer(int a[],long k)
    {
        int n=a.length;
        int left=0,right=0;
        long sum=a[0];
        int maxlen=0;
        while(right<n)
        {
            while (left<=right && sum>k)
            {
                sum=sum-a[left];
                left++;
            }
            if(sum==k)
            {
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<n)
            {
                sum=sum+a[right];
            }
        }
        return maxlen;
    }
}
