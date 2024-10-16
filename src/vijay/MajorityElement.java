package vijay;

public class MajorityElement {

    public static void main(String[] args) {
        
        int a[]={1,1,2,2,1,3,4,1,1,1,};
        int majority = findMajority(a);
        System.out.println("Majority element is : "+majority);

    }

    public static int findMajority(int a[])
    {
        int n = a.length;
        int cnt=0;
        int el=0;
        for(int i=0;i<n;i++)
        {
            if(cnt==0)
            {
                cnt=1;
                el=a[i];
            } else if (el==a[i]) {

                cnt++;
            }else cnt--;
        }

        int cnt1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==el) cnt1++;
        }
        if(cnt1>(n/2))
        {
            return el;
        }
        return -1;

    }
}
