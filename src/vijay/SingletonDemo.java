package vijay;

public class SingletonDemo {


    private static SingletonDemo demo;
    private SingletonDemo()
    {

    }
    public static SingletonDemo  getInstance()
    {
        if(demo== null){
            demo=new SingletonDemo();
            System.out.println("Instance is created ");
        }
        return demo;
    }

    public static void main(String[] args) {
        //SingletonDemo demo=new SingletonDemo();
        SingletonDemo demo = SingletonDemo.getInstance();

        System.out.println(demo.hashCode());

        SingletonDemo demo1 = SingletonDemo.getInstance();

        System.out.println(demo1.hashCode());
    }
}
