public class Decrypting extends VegenereCipher{

    public String decrypting() {
        int keyCounter = 0;
        int textCounter = 0;
        int indexColumn;
        StringBuilder decryptedText = new StringBuilder();
        while(true) {

            if(keyCounter == key.length()) {
                keyCounter = 0;
            }
            int charNumericValue = key.charAt(keyCounter);
            keyCounter++;
            //AQUIII!
            if(text.charAt(textCounter) > charNumericValue) {
                indexColumn = (FINAL_VALUE - charNumericValue) - (FINAL_VALUE - text.charAt(textCounter));
            } else {
                int varCalculo = charNumericValue - text.charAt(textCounter);
                if(varCalculo == 0) {
                    indexColumn = 0;
                } else {
                    indexColumn = (26 - (charNumericValue - text.charAt(textCounter)));
                }
            }
            //AQUIII!
            textCounter++;

            decryptedText.append(tabulaRecta.get(0).get(indexColumn));

            if(textCounter > text.length() - 1) {
                break;
            }
            
        }
        return decryptedText.toString();
    }
}
