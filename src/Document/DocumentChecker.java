package Document;

public class DocumentChecker {
    public static void main(String[] args) {

        Document excelDokument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        excelDokument.getDescription();
        pdfDocument.getDescription();
    }
}
