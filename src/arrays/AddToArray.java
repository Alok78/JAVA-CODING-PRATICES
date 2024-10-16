package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {

        int[]a={1,3,9};
        int k=83;
        List<Integer> integers = addArray(a, k);
        System.out.println(integers);

    }


    public static List<Integer> addArray(int[] num, int k)
    {
        List<Integer> ans=new ArrayList<>();
        int i=num.length-1;
        int carry=0;
        while(i>=0 || k>0)
        {
            int val=0;
            if(i>=0)
            {
                val=num[i];
            }
            int d=k%10;
            int sum=val+d+carry;
            int digit=sum%10;
            carry=sum/10;
            ans.add(digit);
            i--;
            k=k/10;
        }
        if(carry>0)
        {
            ans.add(carry);
        }
        Collections.reverse(ans);
        return  ans;
    }
}
