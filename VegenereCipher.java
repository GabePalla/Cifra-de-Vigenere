import java.util.List;

public abstract class VegenereCipher {
    protected String text;
    protected String key;
    protected List<List> tabulaRecta;
    protected final int INITIAL_VALUE = 65;
    protected final int FINAL_VALUE = 90;

    protected void setData(String text, String key) {
        this.text = text.toUpperCase().replace(" ", "");
        this.key = key.toUpperCase();
    }

    protected void setTabulaRecta(List<List> tabulaRecta) {
        this.tabulaRecta = tabulaRecta;
    }
}
