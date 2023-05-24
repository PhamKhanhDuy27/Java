public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle() {
    }
    public ResizeableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(double percent) {
        setRadius(getRadius() * (1 + (percent / 100)));
    }
}
