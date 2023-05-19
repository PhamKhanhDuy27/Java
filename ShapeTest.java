public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        Circle1 circle = new Circle1();
        System.out.println(circle);
        circle = new Circle1(3.5);
        System.out.println(circle);
        circle = new Circle1(3.5, "indigo", false);
        System.out.println(circle);

        Rectangle1 rectangle = new Rectangle1();
        System.out.println(rectangle);
        rectangle = new Rectangle1(2.3,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle1(2.5,3.8,"orange",true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8,"yellow",true);
        System.out.println(square);
    }
}
class Shape {
    private String color = "green";
    private boolean filled = true;
    public Shape() {
    }
    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}
class Circle1 extends Shape {
    private double radius = 1.0;
    public Circle1() {
    }
    public Circle1(double radius) {
        this.radius = radius;
    }
    public Circle1(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public double getPermeter() {
        return 2 * this.radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
class Rectangle1 extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle1() {
    }
    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle1(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    public double getPermeter() {
        return 2 * (this.width + this.length);
    }
    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = " + getLength() + ", which is a subclass of " + super.toString();
    }
}
class Square extends Rectangle1 {
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
