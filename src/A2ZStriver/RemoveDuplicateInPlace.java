package A2ZStriver;

public class RemoveDuplicateInPlace {

    public static void main(String[] args) {

        int a[]={2,2,6,6,3};
        int i = removeDuplicate(a);
        for(int j=0;j<i;j++)
        {
            System.out.println(a[j]);
        }
    }

    public static int removeDuplicate(int[] arr)
    {
        int i=0;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
