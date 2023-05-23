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
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        return (this.b * this.b - (4 * this.a * this.c));
    }
    public double getRoot1() {
        return ((-this.b + Math.pow(this.b * this.b - (4 * this.a * this.c), 0.5)) / (2 * this.a));
    }
    public double getRoot2() {
        return ((-this.b - Math.pow(this.b * this.b - (4 * this.a * this.c), 0.5)) / (2 * this.a));
    }
}
