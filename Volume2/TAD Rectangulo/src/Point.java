public class Point {

    // Point Attributes:
    int x, y;

    // Point Constructors:

    Point() {
        x = y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    // Point Setters:

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    // Point Getters:

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    // Point toString:

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
