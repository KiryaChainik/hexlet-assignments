package exercise;

// BEGIN
public class Segment {
    Point start;
    Point end;

    Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getBeginPoint() {
        return start;
    }
    public Point getEndPoint() {
        return end;
    }
    public Point getMidPoint() {
        var ax = start.gextX();
        var ay = start.getY();
        var bx = end.gextX();
        var by = end.getY();
        var cx = (ax + bx) / 2;
        var cy = (ay + by) / 2;
        Point mp = new Point(cx, cy);
        return mp;
    }
}
// END
