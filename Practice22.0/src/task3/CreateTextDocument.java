package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CreateTextDocument implements ICreateDocument {
    private final List<TextDocument> textDocuments = new ArrayList<>();
    private TextDocument curTextDocument = null;
    @Override
    public TextDocument createNew(String name) {
        curTextDocument = new TextDocument(name);
        return curTextDocument;
    }

    @Override
    public TextDocument createOpen(int index) {
        curTextDocument = textDocuments.get(index);
        return textDocuments.get(index);
    }

    @Override
    public void pushDocument(IDocument document) {
        textDocuments.add((TextDocument) document);
    }

    @Override
    public void saveData() {
        for(TextDocument doc: textDocuments)
            if(Objects.equals(doc.getName(), curTextDocument.getName()))
                return;

        pushDocument(curTextDocument);
    }

    @Override
    public int getDocumentsCount() {
        return textDocuments.size();
    }

    public List<TextDocument> getDocuments() {
        return textDocuments;
    }

    public void setText(String text){
        curTextDocument.setText(text);
    }
}
