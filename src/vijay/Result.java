package vijay;

public class Result {
    public static void fizzBuzz(int n) {

        // Write your code here
        for(int i=1;i<n;i++){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }if (i%3==0) {
                System.out.println("Fizz");

            } if(i%5==0){
                System.out.println("Buzz");

            }else {
                System.out.println(i);

            }

        }

    }

}
