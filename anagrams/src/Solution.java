import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map mapA = getAnagramLetters(a);
        Map mapB = getAnagramLetters(b);

        Boolean isAnagram = true;

        for(Object letter : mapA.keySet()){
            if(!mapB.containsKey(letter)){
                return false;
            }
            if(mapA.get(letter) != mapB.get(letter)){
                return false;
            }
        }

        return isAnagram;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static Map<String, Integer> getAnagramLetters(String word){
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            map.merge(String.valueOf(letter), 1, Integer::sum);
        }
        return map;
    }
}
