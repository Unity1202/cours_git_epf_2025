package org.oxyl;

public class Point {
    //Attributs
    private double x, y;

    //Constructeurs
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    //Methodes
    public boolean equals(Object obj) {
        if (obj instanceof Point){
            Point p = (Point) obj;
            if (this.x == p.x && this.y == p.y){
                return true;
            }
        }
        return false;
    }

    public double calculerDistance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
