package pr8_3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class AnimationApp {

    public static void main(String[] args) {
        // Запрос пути к GIF-изображению у пользователя
        String imagePath = getInputImagePath();

        // Создание окна
        JFrame frame = new JFrame("Анимация GIF");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загрузка GIF-изображения
        ImageIcon gifIcon = new ImageIcon(imagePath);

        // Создание метки для отображения анимации
        JLabel gifLabel = new JLabel(gifIcon);

        // Добавление метки в окно
        frame.getContentPane().add(gifLabel);

        // Устанавливаем размер окна
        frame.pack();
        frame.setVisible(true);

        // Запускаем анимацию
        gifIcon.getImage().flush();
        ((ImageIcon) gifLabel.getIcon()).setImageObserver(gifLabel);
    }

    private static String getInputImagePath() {
        // Запрос пути к GIF-изображению у пользователя
        System.out.print("Введите путь к GIF-изображению: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}