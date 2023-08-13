import java.util.List;

public class Encoding {

    private String text;
    private String key;
    private List<List<Character>> tabulaRecta;

    // public String encoding() {
        
    // }

    public void setData(String text, String key) {
        this.text = text.toUpperCase();
        this.key = key.toUpperCase();
    }

    public void setTabulaRecta(List<List<Character>> tabulaRecta) {
        this.tabulaRecta = tabulaRecta;
    }

}
