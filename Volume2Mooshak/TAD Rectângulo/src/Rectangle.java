public class Rectangle {


    Point p1, p2;


    public Rectangle(int x1, int y1, int x2, int y2) {
         p1 = new Point(x1, y1);
         p2 = new Point(x2, y2);

        this.p1 = p1;
        this.p2 = p2;
    }

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public int area() {
        int comprimento = getP2().x - getP1().x;
        int largura = getP2().y - getP1().y;
        return comprimento * largura;
    }

    public int perimeter() {
        int comprimento = getP2().x - getP1().x;
        int largura = getP2().y - getP1().y;
        return (2 * largura) + (2 * comprimento);
    }

    public boolean pointInside(Point p) {
        if (p1.x > p.x || p.x > p2.x) {
            return false;
        }
        if (p1.y > p.y || p.y > p2.y) {
            return false;
        }
        return true;


    }
    public boolean rectangleInside(Rectangle r) {
        if (pointInside(r.p1)&&pointInside(r.p2)){
            return true;
        }
        return false;
    }
}
