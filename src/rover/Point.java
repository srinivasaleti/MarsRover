package rover;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point pointAfter(Point offset) {
        return new Point(x + offset.x, y + offset.y);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
