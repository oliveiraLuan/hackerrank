import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        scanner.close();

        NumberFormat nfUS = NumberFormat.getInstance(Locale.US);
        NumberFormat nfIN = NumberFormat.getInstance(new Locale("en", "in"));
        NumberFormat nfCH = NumberFormat.getInstance(Locale.CHINA);
        NumberFormat nfFR = NumberFormat.getInstance(Locale.FRANCE);

        System.out.println("US: $" + nfUS.format(payment));
        System.out.println("India: Rs." + nfIN.format(payment));
        System.out.println("China: \u00a5" + nfCH.format(payment));
        System.out.println("France: " + nfFR.format(payment) + "\u20AC");
    }
}

