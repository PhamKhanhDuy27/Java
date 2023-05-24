public class ResizeableRectangle extends Rectangle implements Resizeable {
    public ResizeableRectangle() {
    }
    public ResizeableRectangle(double width, double height) {
        super(width, height);
    }
    @Override
    public void resize (double percent) {
        setWidth(getWidth() * (1 + percent / 100));
        setHeight(getHeight() * (1 + percent / 100));
    }
}
