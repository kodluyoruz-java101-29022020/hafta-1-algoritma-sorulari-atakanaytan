package sixthQuestion.document;

import sixthQuestion.DocumentImp;

public class WordDocument implements DocumentImp {

    private String body ="";

    public WordDocument(String body) {
        this.body = body;
    }

    @Override
    public String getBody() {
        return this.body;
    }
}
