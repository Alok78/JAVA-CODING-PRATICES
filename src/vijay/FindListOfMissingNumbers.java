package vijay;

public class FindListOfMissingNumbers {

    public static void main(String[] args) {
        int []input={2,2,5,9,13,100,18,18,15,20};
        int[] copy=new int[101];
        for(int iter:input)
        {
            copy[iter]=1;
        }
        for(int i=1;i<copy.length;i++)
        {
            if(copy[i]==0)
            {
                System.out.println(i+ " ");
            }
        }
    }
}
