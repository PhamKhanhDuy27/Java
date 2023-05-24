import java.util.Random;


import java.util.Random;
public class ResizeableTest {
    public static void main(String[] args) {
        ResizeableCircle circles = new ResizeableCircle();
        circles.setRadius(4.8);
        System.out.println("Circle has radius = " + circles.getRadius() + " Area = " + circles.getArea());

        Random random = new Random();
        double resizeRatio = random.nextInt(100) + 1;

        circles.resize(resizeRatio);
        System.out.println("Circle has radius = " + circles.getRadius() + " Area = " + circles.getArea() + " Resize = " + resizeRatio);

        ResizeableRectangle rectangles = new ResizeableRectangle();
        rectangles.setHeight(3.2);
        rectangles.setWidth(5.6);
        System.out.println("Rectangle has Height = " + rectangles.getHeight() + " Width = " + rectangles.getWidth() + " Area = " + rectangles.getArea());
        rectangles.resize(resizeRatio);
        System.out.println("Rectangle has Height = " + rectangles.getHeight() + " Width = " + rectangles.getWidth() + " Area = " + rectangles.getArea() + "Resize = " + resizeRatio);
    }
}