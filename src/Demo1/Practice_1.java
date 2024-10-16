package Demo1;

public class Practice_1 {

    public static void main(String[] args) {
        String str="abc";
        for (int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
        System.out.println("Hello World!!");
    }



}
