import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        double a, b ,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.print("The quadratic equation has: \na = " + quadraticEquation.getA() + "\nb = " + quadraticEquation.getB() + "\nc = " + quadraticEquation.getC() + "\n");
        System.out.println("Delta = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("Root 1 = " + quadraticEquation.getRoot1());
            System.out.println("Root 2 = " + quadraticEquation.getRoot2());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        double delta = b * b - (4 * a * c);
        return delta;
    }
    public double getRoot1() {
        double r1 = ((-b + Math.pow(b * b - (4 * a * c), 0.5)) / (2 * a));
        return r1;
    }
    public double getRoot2() {
        double r2 = ((-b - Math.pow(b * b - (4 * a * c), 0.5)) / (2 * a));
        return r2;
    }
}
