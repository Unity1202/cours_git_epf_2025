package org.oxyl;

public class TriangleAvecPoint {
    //Attributs
    private Point point1, point2, point3;
    
    //Constructeurs
    public TriangleAvecPoint(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    public TriangleAvecPoint(){
        this.point1 = new Point(0.0, 0.0);
        this.point2 = new Point(0.0, 1.0);
        this.point3 = new Point(0.5, 0.5);
    }
    public TriangleAvecPoint(TriangleAvecPoint triangle) {
        this.point1 = triangle.point1;
        this.point2 = triangle.point2;
        this.point3 = triangle.point3;
    }
    
    //Methodes
    public void deplacer(double distanceX, double distanceY){
        this.point1.setX(this.point1.getX() + distanceX);
        this.point2.setX(this.point2.getX() + distanceX);
        this.point3.setX(this.point3.getX() + distanceX);
        this.point1.setY(this.point1.getY() + distanceY);
        this.point2.setY(this.point2.getY() + distanceY);
        this.point3.setY(this.point3.getY() + distanceY);
    }

    public void tourner(double theta) {
        // Angle en radians
        double radian = Math.toRadians(theta);

        // Coordonnées du barycentre
        double baryX = (this.point1.getX() + this.point2.getX() + this.point3.getX()) / 3.0;
        double baryY = (this.point1.getY() + this.point2.getY() + this.point3.getY()) / 3.0;

        // Calcul des nouvelles coordonnées
        double newX1 = baryX + (this.point1.getX() - baryX) * Math.cos(radian) - (this.point1.getY() - baryY) * Math.sin(radian);
        double newY1 = baryY + (this.point1.getX() - baryX) * Math.sin(radian) + (this.point1.getY() - baryY) * Math.cos(radian);

        double newX2 = baryX + (this.point2.getX() - baryX) * Math.cos(radian) - (this.point2.getY() - baryY) * Math.sin(radian);
        double newY2 = baryY + (this.point2.getX() - baryX) * Math.sin(radian) + (this.point2.getY() - baryY) * Math.cos(radian);

        double newX3 = baryX + (this.point3.getX() - baryX) * Math.cos(radian) - (this.point3.getY() - baryY) * Math.sin(radian);
        double newY3 = baryY + (this.point3.getX() - baryX) * Math.sin(radian) + (this.point3.getY() - baryY) * Math.cos(radian);

        // Appliquer l'arrondi à deux chiffres après la virgule
        this.point1.setX(Math.round(newX1 * 100.0) / 100.0);
        this.point1.setY(Math.round(newY1 * 100.0) / 100.0);

        this.point2.setX(Math.round(newX2 * 100.0) / 100.0);
        this.point2.setY(Math.round(newY2 * 100.0) / 100.0);

        this.point3.setX(Math.round(newX3 * 100.0) / 100.0);
        this.point3.setY(Math.round(newY3 * 100.0) / 100.0);
    }

    public boolean isEquilateral() {
        // Calcul des longueurs du triangle
        double distance1 = Math.sqrt(Math.pow((this.point1.getX() - this.point2.getX()), 2) + Math.pow((this.point1.getY() - this.point2.getY()), 2));
        double distance2 = Math.sqrt(Math.pow((this.point2.getX() - this.point3.getX()), 2) + Math.pow((this.point2.getY() - this.point3.getY()), 2));
        double distance3 = Math.sqrt(Math.pow((this.point1.getX() - this.point3.getX()), 2) + Math.pow((this.point1.getY() - this.point3.getY()), 2));

        // Arrondir a deux chiffres apres la virgule
        distance1 = Math.round(distance1 * 100.0) / 100.0;
        distance2 = Math.round(distance2 * 100.0) / 100.0;
        distance3 = Math.round(distance3 * 100.0) / 100.0;

        if ((distance1 == distance2) && (distance2 == distance3)){
            return true;
        }
        return false;
    }

}
