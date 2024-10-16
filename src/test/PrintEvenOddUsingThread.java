package test;

public class PrintEvenOddUsingThread {

    private volatile int count=1;
    private int limit;

    public PrintEvenOddUsingThread(int limit) {
        this.limit = limit;
    }

    public synchronized  void printOdd()
    {
        while(count<=limit)
        {
            if(count%2==1)
            {
                System.out.println(Thread.currentThread().getName()+" - "+count);
                count++;
                notifyAll();
            }
            else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public synchronized void printEven()
    {
        while(count<=limit)
        {
            if(count%2==0)
            {
                System.out.println(Thread.currentThread().getName()+" - "+count);
                count++;
                notifyAll();
            }
            else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {

        PrintEvenOddUsingThread test=new PrintEvenOddUsingThread(10);
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                test.printOdd();
            }
        });
        t1.setName("ODD");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                test.printEven();
            }
        });

        t2.setName("EVEN");
        t1.start();
        t2.start();
    }
}
