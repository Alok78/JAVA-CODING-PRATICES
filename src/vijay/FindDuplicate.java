package vijay;

import java.util.Arrays;

public class FindDuplicate
{
    public static void main(String[] args) {

        int[] arr={1,1,3,5,4,6,6};
        int unique = getUnique(arr);
        for(int i=0;i<unique;i++) {
            //System.out.print(arr[i] + " ");
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]);
                    break;
                }
            }

        }

       /* int dup = printDuplicate(arr);
        for(int i=0;i<dup;i++) {
            System.out.print("Dulicate "+arr[i] + " ");
        }*/
    }

    public static int getUnique(int[] arr)
    {
        Arrays.sort(arr);
        int i=0;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return  i+1;
    }

    /*public static int printDuplicate(int arr[])
    {
        int i=0;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i+1]+ " ");
            }
        }
        return i+1;
    }*/
}
