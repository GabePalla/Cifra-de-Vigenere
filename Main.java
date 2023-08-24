import java.util.List;

import Cipher.Decrypting;
import Cipher.Encrypting;
import Cipher.TabulaRectaGenerator;
import GUI.GUI;

public class Main {
    public static void main(String[] args) {
        List<List> tabulaRecta = TabulaRectaGenerator.generateTabulaRecta();
        Encrypting encrypting = new Encrypting(tabulaRecta);
        Decrypting decrypting = new Decrypting(tabulaRecta);

        GUI gui = new GUI();
        gui.actionButton(encrypting, decrypting);
    }
}