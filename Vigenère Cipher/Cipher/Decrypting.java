package Cipher;

import java.util.List;

public class Decrypting extends VegenereCipher {

    public Decrypting(List<List> tabulaRecta) {
        super(tabulaRecta);
    }

    public String decrypting() {
        int keyCounter = 0;
        int textCounter = 0;
        int indexColumn;
        StringBuilder decryptedText = new StringBuilder();
        while (true) {

            if (keyCounter == key.length()) {
                keyCounter = 0;
            }

            int currKeyNumericValue = key.charAt(keyCounter);
            int currTextCharNumericValue = text.charAt(textCounter);

            if (currTextCharNumericValue > currKeyNumericValue) {
                indexColumn = (FINAL_VALUE - currKeyNumericValue) - (FINAL_VALUE - currTextCharNumericValue);
            } else {
                if (currKeyNumericValue - currTextCharNumericValue == 0) {
                    indexColumn = 0;
                } else {
                    indexColumn = (TOTAL_CHARACTERS - (currKeyNumericValue - currTextCharNumericValue));
                }
            }

            keyCounter++;
            textCounter++;

            decryptedText.append(tabulaRecta.get(0).get(indexColumn));

            if (textCounter > text.length() - 1) {
                break;
            }

        }
        return decryptedText.toString();
    }
}
