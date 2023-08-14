public class Main {
    public static void main(String[] args) {
        Encoding encoding = new Encoding();
        encoding.setTabulaRecta(TabulaRectaGenerator.generateTabulaRecta());
        encoding.setData("Calcular e Converter", "FOFO");
        System.out.println(encoding.encoding());

    }
}