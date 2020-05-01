package sixthQuestion;


import sixthQuestion.document.PDFDocument;
import sixthQuestion.document.WordDocument;

public class Main {

    public static void main(String[] args) {

        PDFDocument pdfDocument = new PDFDocument("Kodluyoruz.com First homework of the bootcamp in PDF file");
        WordDocument wordDocument = new WordDocument("Project files in word format");

        Printer printer = new Printer();

        printer.printDocuments(pdfDocument);
        printer.printDocuments(wordDocument);
    }
}
