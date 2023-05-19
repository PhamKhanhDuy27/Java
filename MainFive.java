public class MainFive {
    public static void main(String[] args) {
    Circle2 circle = new Circle2(2.4,"blue");
    System.out.println(circle.toString());

    Circle2 cylinder = new Cylinder(2.5,"red",3.6);
    System.out.println(cylinder.toString());
    }
}
class Circle2 {
    private double radius = 1.0;
    private String color = "black";
    public Circle2() {
    }
    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius = " + getRadius() + ", Color = " + getColor() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
class Cylinder extends Circle2{
    private double height = 1.0;
    public Cylinder() {
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight() {
        this.height = height;
    }
    public double getSurroundingArea() {
        return super.getRadius() * 2 * this.height * Math.PI;
    }
    public double getTotalArea() {
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + this.height);
    }
    public double getVolume() {
        return super.getRadius() * super.getRadius() * this.height * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = " + super.getRadius() + ", color = " + super.getColor() + ", Surrounding Area = " + getSurroundingArea() + ", Total Area = " + getTotalArea() + ", Volume = " + getVolume();
    }
}
