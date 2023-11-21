package task3;

import javax.swing.*;
import java.util.Objects;

public class ImageDocument implements IDocument {
    private ImageIcon image;
    private String name;

    public ImageDocument(String name) {
        this.name = name;
        this.image = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/cap.jpg")));
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    @Override
    public String getTextValue() {
        return null;
    }

    @Override
    public ImageIcon getImageValue() {
        return image;
    }

    @Override
    public String getName() {
        return name;
    }
}
