package task1;

public class ConcreteComplex implements Complex {
    private int real;
    private int imaginary;

    public ConcreteComplex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public int getReal() {
        return real;
    }

    @Override
    public int getImaginary() {
        return imaginary;
    }
}
