public class Ponto {
    int x;
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this.x=0;
        this.y=0;
    }

    @Override
    public String toString() {
        return "x:"+x+",y:"+y;
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }



}
