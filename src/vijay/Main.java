package vijay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
       /* Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
        Result.fizzBuzz(sc.nextInt());
        System.out.println(Result.fizzBuzz(n));*/

    }

}
