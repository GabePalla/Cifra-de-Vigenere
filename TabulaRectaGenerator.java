import java.util.ArrayList;
import java.util.List;

public class TabulaRectaGenerator {
    private final static int FINAL_VALUE = 90;
    private final static int INITIAL_VALUE = 65;

    public static List<List> generateTabulaRecta() {
        List<List> matriz = new ArrayList<>();

        int initializer = INITIAL_VALUE;
        for(int i = 0 ; i < 26; i++) {
            matriz.add(generateAuxList(initializer));
            System.out.println(generateAuxList(initializer)); // Used to test the TabulaRecta, remove later!!
            initializer++;
        }
        return matriz;
    }
    
    private static List<Character> generateAuxList(int initialValue) {
        List<Character> auxList = new ArrayList<>();
        for(int i = 0 ; i < 26; i++) {
            auxList.add(Character.valueOf( (char) initialValue));
            if(initialValue == FINAL_VALUE) {
                initialValue = INITIAL_VALUE;
            } else {
                initialValue++;
            }
            
        }
        return auxList;
    }
}
