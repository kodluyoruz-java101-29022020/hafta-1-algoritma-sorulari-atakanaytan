package sixthQuestion.document;

import sixthQuestion.DocumentImp;

public class PDFDocument implements DocumentImp {

    private String body = "";

    public PDFDocument(String body) {
        this.body = body;
    }

    @Override
    public String getBody() {
        return this.body;
    }
}
