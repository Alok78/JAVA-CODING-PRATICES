package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

       /* Set<Random> set=new HashSet<>();
        set.add(new Random());
        set.add(new Random());
        set.add(new Random());
        set.add(new Random());
        System.out.println(set.toString());*/

        int a[]={1,2,3,4,5,6};
        int i = removeElement(a, 3);
        System.out.println("Modified Array"+ Arrays.toString(Arrays.copyOfRange(a,0,i))

        +"\n new Length: " +i);
    }

    public static int removeElement(int[] nums,int value)
    {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=value)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

}
