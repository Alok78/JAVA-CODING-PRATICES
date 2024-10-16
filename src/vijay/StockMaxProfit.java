package vijay;

public class StockMaxProfit {

    public static void main(String[] args) {

        int a[]={2,4,7,5,8};
        int max = maxProfit(a);
        System.out.println("Profit is : "+max);


        int[] price={10,22,5,75,65,80};
        int secondProfit = twoTransactionProfit(price);
        System.out.println("Two transaction profit is : "+secondProfit);
    }

    public static int maxProfit(int a[])
    {
        int maxPro=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            minPrice=Math.min(minPrice,a[i]);
            System.out.println("Min Price is : "+minPrice);
            maxPro=Math.max(maxPro,a[i]-minPrice);
            System.out.println("Max Profit is :"+maxPro);
        }
        return maxPro;
    }

    public static int twoTransactionProfit(int[] price)
    {
        int firstBuy=Integer.MIN_VALUE;
        int firstSell=0;
        int secondBuy=Integer.MIN_VALUE;
        int secondSell=0;
        for(int p:price)
        {
            firstBuy=Math.max(firstBuy,-p);
            firstSell=Math.max(firstSell,firstBuy+p);
            secondBuy=Math.max(secondBuy,firstSell-p);
            secondSell=Math.max(secondSell,secondBuy+p);
        }
        return  secondSell;
    }
}
