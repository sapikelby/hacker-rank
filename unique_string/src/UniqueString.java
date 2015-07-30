/**
 * Created by Kelby on 7/29/2015.
 * Determines if a string is unique using a hashmap
 * @author Kelby Sapien
 */
import java.util.HashMap;
public class UniqueString {
    static HashMap<Character, String> chars = new HashMap<>();
    public static void main(String[] args) {
        String randWord = "Kelby";
        boolean result = isUnique(randWord);
        System.out.println(result);
    }

    private static boolean isUnique(String word) {
        char[] wordArray = word.toCharArray();
        for(int i=0; i<word.length(); i++) {
            Character charAt = wordArray[i];
            if(!(chars.containsKey(charAt))) {
                chars.put(charAt, charAt.toString());
            }
            else {
                System.out.println(charAt);
                return false;
            }
        }
        return true;
    }
}




