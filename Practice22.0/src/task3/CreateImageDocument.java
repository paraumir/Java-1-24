package task3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CreateImageDocument implements ICreateDocument{
    private final List<ImageDocument> imageDocuments = new ArrayList<>();
    private ImageDocument curImageDocument = null;
    @Override
    public ImageDocument createNew(String name) {
        curImageDocument = new ImageDocument(name);
        return curImageDocument;
    }

    @Override
    public ImageDocument createOpen(int index) {
        curImageDocument = imageDocuments.get(index);
        return imageDocuments.get(index);
    }

    @Override
    public void pushDocument(IDocument document) {
        imageDocuments.add((ImageDocument) document);
    }

    @Override
    public void saveData() {
        for(ImageDocument doc: imageDocuments)
            if(Objects.equals(doc.getName(), curImageDocument.getName()))
                return;

        pushDocument(curImageDocument);
    }

    @Override
    public int getDocumentsCount() {
        return imageDocuments.size();
    }

    public List<ImageDocument> getDocuments() {
        return imageDocuments;
    }

    public void setImage(ImageIcon image){
        curImageDocument.setImage(image);
    }
}
