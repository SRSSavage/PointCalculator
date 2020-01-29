package academy.learnprogramming;

public class Point {

    private int x;
    private int y;


    //constructors
    public Point(){
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // class methods
    public double distance(){
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y - y)*(this.y-y));
    }

    public double distance(Point other){
        return Math.sqrt((this.x-other.x) * (this.x-other.x) + (this.y-other.y)*(this.y-other.y));
    }
}
