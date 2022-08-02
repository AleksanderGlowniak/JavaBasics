package docs;

public class Documentchecker {
    public static void main(String[] args) {
        Document pdfdoc = new PdfDocument();
        Document exceldoc = new ExecelDocument();

        pdfdoc.getDescription();
        exceldoc.getDescription();
    }
}
