package pr8_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape() {
        Random random = new Random();
        this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        this.x = random.nextInt(400); // Ширина окна
        this.y = random.nextInt(400); // Высота окна
    }

    public abstract void draw(Graphics g);
}

class RectangleShape extends Shape {
    private int width;
    private int height;

    public RectangleShape() {
        super();
        Random random = new Random();
        this.width = random.nextInt(100) + 10; // Ширина прямоугольника
        this.height = random.nextInt(100) + 10; // Высота прямоугольника
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class CircleShape extends Shape {
    private int radius;

    public CircleShape() {
        super();
        Random random = new Random();
        this.radius = random.nextInt(50) + 10; // Радиус круга
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class DrawingPanel extends JPanel {
    private Shape[] shapes;

    public DrawingPanel() {
        shapes = new Shape[20];
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                shapes[i] = new RectangleShape();
            } else {
                shapes[i] = new CircleShape();
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}

class RandomShapesApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new DrawingPanel());
        frame.setVisible(true);
    }
}