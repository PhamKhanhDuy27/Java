public class TestCircle {
    public static void main(String[] args) {
    Circle circle1 = new Circle(2.3,"blue");
    System.out.println("Circle has: radius = " + circle1.getRadius() + " color = " + circle1.getColor() + " Area = " + circle1.getArea());
    circle1.setRadius(3.6);
    circle1.setColor("black");
    System.out.println("Circle has: radius = " + circle1.getRadius() + " color = " + circle1.getColor() + " Area = " + circle1.getArea());
    }
}
class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
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
}
