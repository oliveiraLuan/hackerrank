import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        int n = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        String[] arrayStrings = numbers.split(" ");

        for(String number : arrayStrings){
            Integer numero = Integer.parseInt(number);
            lista.add(numero);
        }

        int q = scanner.nextInt();

        for(int i = 0; i < q; i++){
            String function = scanner.nextLine();

            if(function.equals("Delete")){
                String index = scanner.next();
                lista.remove(Integer.parseInt(index));
            }
        }

        System.out.println(lista);

        scanner.close();
    }
}