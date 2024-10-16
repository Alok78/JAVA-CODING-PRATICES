package leetcode;

public class MergeArray {

    public static void main(String[] args) {

        int[] a={1,5,2};
        int[] b={3,4,6};
        int m=a.length;
        int n=b.length;
        mergeArray(a,m,b,n);

    }
    public static void mergeArray(int[] nums1,int m, int[] nums2,int n)
    {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (j>=0)
        {
            if(i>=0 && nums1[i]>nums2[j])
            {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }

        }
    }
}
