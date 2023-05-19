import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(0.5f,0.6f);
        System.out.println(point1.toString());
        Point3D point2 = new Point3D(0.9f, 0.7f,0.6f);
        System.out.println(point2.toString());
    }
}
class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return this.x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return this.y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        return new float[]{this.x, this.y};
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point2D has coordinates: " + Arrays.toString(getXY());
    }
}
class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{super.getX(),super.getY(), this.z};
    }
    public String toString() {
        return "Point3D has coordinates: " + Arrays.toString(getXYZ());
    }
}