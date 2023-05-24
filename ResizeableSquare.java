public class ResizeableSquare extends Square implements Resizeable {
    public ResizeableSquare() {
    }
    public ResizeableSquare(double side) {
        super(side);
    }
    @Override
    public void resize (double percent) {
        setWidth(getSide() * (1 + percent / 100));
    }
}
