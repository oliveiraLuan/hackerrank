import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        String reversedWord = "";
        /* Enter your code here. Print output to STDOUT. */

        for(int i = text.length() - 1; i >= 0 ; i--){
            reversedWord = reversedWord + text.charAt(i);
        }

        if(text.equalsIgnoreCase(reversedWord))
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}



