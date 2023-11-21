package pr5_1_1;

public abstract class Shape {
    private boolean filled;
    private String color;

    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }
    public Shape()
    {}
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean a){
         filled=a;
    }

    public String getColor() {
        return color;
    }
   public void setColor(String a)
   {
       color=a;
   }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        return "Shape [filled=" + filled + ", color=" + color + "]";
    }
}