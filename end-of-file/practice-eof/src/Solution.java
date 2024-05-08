import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while(scanner.hasNext()){
            String text = scanner.nextLine();
            System.out.println(count + " " + text);
            count++;
        }

        scanner.close();
    }
}