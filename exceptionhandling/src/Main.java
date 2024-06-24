import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x / y;

            System.out.println(result);
            scanner.close();
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }
}