import java.util.ArrayList;
import java.util.List;

public class TabulaRectaGenerator {
    private final static int FINAL_VALUE = 90;
    private final static int INITIAL_VALUE = 65;
    private final static int TOTAL_CHARACTERS = 26; //Verificar se é melhor usar isso.?

    public static List<List> generateTabulaRecta() {
        List<List> matriz = new ArrayList<>();

        int initializer = TabulaRectaGenerator.INITIAL_VALUE;
        for(int i = 0 ; i < TabulaRectaGenerator.TOTAL_CHARACTERS; i++) {
            matriz.add(TabulaRectaGenerator.generateAuxList(initializer));
            System.out.println(TabulaRectaGenerator.generateAuxList(initializer));
            initializer++;
        }
        return matriz;
    }
    
    private static List<Character> generateAuxList(int initialValue) {
        List<Character> auxList = new ArrayList<>();
        for(int i = 0 ; i < TabulaRectaGenerator.TOTAL_CHARACTERS; i++) {
            auxList.add(Character.valueOf( (char) initialValue));
            if(initialValue == TabulaRectaGenerator.FINAL_VALUE) {
                initialValue = TabulaRectaGenerator.INITIAL_VALUE;
            } else {
                initialValue++;
            }
        }
        return auxList;
    }
}
