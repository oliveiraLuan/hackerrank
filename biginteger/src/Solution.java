import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        BigInteger sum = a.add(b);
        BigInteger multiply = a.multiply(b);

        System.out.println(sum);
        System.out.println(multiply);

        scanner.close();
    }
}