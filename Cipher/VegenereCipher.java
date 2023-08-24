package Cipher;

import java.util.List;

public abstract class VegenereCipher {
    protected String text;
    protected String key;
    protected List<List> tabulaRecta;
    protected final int INITIAL_VALUE = 65;
    protected final int FINAL_VALUE = 90;
    protected final int TOTAL_CHARACTERS = 26;

    public VegenereCipher(List<List> tabulaRecta) {
        this.tabulaRecta = tabulaRecta;
    }

    public void setData(String text, String key) {
        this.text = text.toUpperCase().replace(" ", "");
        this.key = key.toUpperCase();
    }
}
