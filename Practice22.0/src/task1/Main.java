package task1;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        System.out.println("Complex 1: Real = " + complex1.getReal() + ", Imaginary = " + complex1.getImaginary());

        Complex complex2 = factory.createComplex(2, 3);
        System.out.println("Complex 2: Real = " + complex2.getReal() + ", Imaginary = " + complex2.getImaginary());
    }
}