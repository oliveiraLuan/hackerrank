import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        String paymentString = "" + payment;
        scanner.close();

        NumberFormat nfUS = NumberFormat.getInstance(Locale.US);
        NumberFormat nfCH = NumberFormat.getInstance(Locale.CHINA);
        NumberFormat nfFR = NumberFormat.getInstance(Locale.FRANCE);

        // Write your code here.

        System.out.println("US: " + "$" + nfUS.parse(paymentString));
        System.out.println("India: " + "Rs." + formatIndian(paymentString));
        System.out.println("China: " + "￥" + nfCH.parse(paymentString));
        System.out.println("France: " + nfFR.parse(paymentString) + " €");
    }

    public static String formatIndian(String value) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        return nf.parse(value).toString();
    }
}

