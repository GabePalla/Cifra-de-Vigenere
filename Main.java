import java.util.List;

import Cipher.Decrypting;
import Cipher.Encrypting;
import Cipher.TabulaRectaGenerator;

public class Main {
    public static void main(String[] args) {
        List<List> tabulaRecta = TabulaRectaGenerator.generateTabulaRecta();

        Encrypting encrypting = new Encrypting();
        encrypting.setTabulaRecta(tabulaRecta);
        encrypting.setData("TEXTO DE TESTE", "FOGO");

        String encryptedText = encrypting.encrypting();

        Decrypting decrypting = new Decrypting();
        decrypting.setTabulaRecta(tabulaRecta);
        decrypting.setData(encryptedText, "FOGO");

        String decryptedText = decrypting.decrypting();

        System.out.println("Encrypted Text: " + encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
        


    }
}