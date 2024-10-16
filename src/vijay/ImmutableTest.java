package vijay;

public final class ImmutableTest {

    private final String str;
    private final int i;

    public ImmutableTest(String str, int i) {
        this.str = str;
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public String getStr(){
        return str;
   }

    public static void main(String[] args) {

        ImmutableTest t1=new ImmutableTest("ABC",1);
        System.out.println(t1.getI());
        ImmutableTest t2=new ImmutableTest("XYZ",2);
        System.out.println(t2.getI());

    }
}
