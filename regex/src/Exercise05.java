import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Exercise05 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap urls = new HashMap<>();

        String pattern = "\\href=\"(.+?)\"";
        Pattern url = Pattern.compile(pattern);

        String pattern2 = "href=\".+?\">(.+?)<";
        Pattern text = Pattern.compile(pattern2);

        scanner.close();
    }
}