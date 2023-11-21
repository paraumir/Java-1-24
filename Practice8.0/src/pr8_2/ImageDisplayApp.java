package pr8_2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class ImageDisplayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the image: ");
        String imagePath = scanner.nextLine();

        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}
