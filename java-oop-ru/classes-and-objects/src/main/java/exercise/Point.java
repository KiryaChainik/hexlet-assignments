package exercise;

// BEGIN
public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getX(Point point) {
        return point.x;
    }
    public static int getY(Point point) {
        return point.y;
    }
}
// END
