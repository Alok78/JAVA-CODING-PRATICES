package vijay;

public class RotateElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;
        rotateArrayElementToRight(arr,  k);
        System.out.print("After Rotating the k elements to right ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        /*rotateeletoleft(arr,  k);
        System.out.print("After Rotating the k elements to left ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();*/

    }
    public static void rotateeletoleft(int[] arr, int k) {

        int n=arr.length;
        k=k%n;
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        reverse(arr, k , n - 1);
        // Reverse whole array
        reverse(arr, 0, n - 1);
    }
    public static  void rotateArrayElementToRight(int arr[],int k)
    {
        int n=arr.length;
        k=k%n;
        // Reverse first n-k elements
        reverse(arr,0,n-k-1);

        // Reverse last k elements
        reverse(arr,n-k,n-1);
        // Reverse whole array
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[],int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
