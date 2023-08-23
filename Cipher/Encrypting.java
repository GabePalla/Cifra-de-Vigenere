package Cipher;
public class Encrypting extends VegenereCipher{

    public String encrypting() {
        int keyCounter = 0;
        int textCounter = 0;
        StringBuilder encryptedText = new StringBuilder();
        while(true) {

            if(keyCounter == key.length()) {
                keyCounter = 0;
            }

            int indexLine = key.charAt(keyCounter) - INITIAL_VALUE;
            keyCounter++;
            
            int indexColumn = text.charAt(textCounter) - INITIAL_VALUE;
            textCounter++;

            encryptedText.append(tabulaRecta.get(indexLine).get(indexColumn));

            if(textCounter > text.length() - 1) {
                break;
            }
            
        }
        return encryptedText.toString();
    }
}
