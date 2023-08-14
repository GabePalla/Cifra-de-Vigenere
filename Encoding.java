import java.util.List;

public class Encoding {

    private String text;
    private String key;
    private List<List> tabulaRecta;

    public String encoding() {
        int keyCounter = 0;
        int textCounter = 0;
        StringBuilder textC = new StringBuilder();
        while(true) {

            if(keyCounter == key.length()) {
                keyCounter = 0;
            }
            
            int indexLine = key.charAt(keyCounter) - 65;
            keyCounter++;
            
            int indexColumn = text.charAt(textCounter) - 65;
            textCounter++;

            textC.append(tabulaRecta.get(indexLine).get(indexColumn));

            if(textCounter > text.length() - 1) {
                break;
            }
            
        }
        return textC.toString();
    }

    public void setData(String text, String key) {
        this.text = text.toUpperCase().replace(" ", "");
        this.key = key.toUpperCase();
    }

    public void setTabulaRecta(List<List> tabulaRecta) {
        this.tabulaRecta = tabulaRecta;
    }

}
