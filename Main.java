public class Main {
    public static void main(String[] args) {
        Encrypting encoding = new Encrypting();
        Decrypting decrypeting = new Decrypting();
        encoding.setTabulaRecta(TabulaRectaGenerator.generateTabulaRecta());
        encoding.setData("BATATA", "FOFO");
        String texto = encoding.encrypting();
        System.out.println(texto);

        decrypeting.setTabulaRecta(TabulaRectaGenerator.generateTabulaRecta());
        decrypeting.setData(texto, "FOFO");
        System.out.println(decrypeting.decrypting());

    }
}