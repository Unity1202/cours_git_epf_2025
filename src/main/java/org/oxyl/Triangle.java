package org.oxyl;

public class Triangle {
    //Attributs
    private double x1, y1, x2, y2, x3, y3;

    //Constructeurs
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    public Triangle(){
        this.x1 = 0.0;
        this.y1 = 0.0;
        this.x2 = 0.0;
        this.y2 = 1.0;
        this.x3 = 0.5;
        this.y3 = 0.5;
    }
    public Triangle(Triangle triangle){
        this.x1 = triangle.x1;
        this.y1 = triangle.y1;
        this.x2 = triangle.x2;
        this.y2 = triangle.y2;
        this.x3 = triangle.x3;
        this.y3 = triangle.y3;
    }


    //Methodes
    public void deplacer(double distanceX, double distanceY){
        this.x1 += distanceX;
        this.y1 += distanceY;
        this.x2 += distanceX;
        this.y2 += distanceY;
        this.x3 += distanceX;
        this.y3 += distanceY;
    }

    public void tourner(double theta) {
        // Convertir l'angle en radians
        double radian = Math.toRadians(theta);

        // Calcul du barycentre
        double baryX = (this.x1 + this.x2 + this.x3) / 3.0;
        double baryY = (this.y1 + this.y2 + this.y3) / 3.0;

        // Appliquer la rotation à chaque point
        double newX1 = baryX + (this.x1 - baryX) * Math.cos(radian) - (this.y1 - baryY) * Math.sin(radian);
        double newY1 = baryY + (this.x1 - baryX) * Math.sin(radian) + (this.y1 - baryY) * Math.cos(radian);

        double newX2 = baryX + (this.x2 - baryX) * Math.cos(radian) - (this.y2 - baryY) * Math.sin(radian);
        double newY2 = baryY + (this.x2 - baryX) * Math.sin(radian) + (this.y2 - baryY) * Math.cos(radian);

        double newX3 = baryX + (this.x3 - baryX) * Math.cos(radian) - (this.y3 - baryY) * Math.sin(radian);
        double newY3 = baryY + (this.x3 - baryX) * Math.sin(radian) + (this.y3 - baryY) * Math.cos(radian);

        // Arrondir à deux chiffres après la virgule
        this.x1 = Math.round(newX1 * 100.0) / 100.0;
        this.y1 = Math.round(newY1 * 100.0) / 100.0;
        this.x2 = Math.round(newX2 * 100.0) / 100.0;
        this.y2 = Math.round(newY2 * 100.0) / 100.0;
        this.x3 = Math.round(newX3 * 100.0) / 100.0;
        this.y3 = Math.round(newY3 * 100.0) / 100.0;
    }

    public boolean isEquilateral() {
        // Calcul des longueurs du triangle
        double distance1 = Math.sqrt(Math.pow((this.x1 - this.x2), 2) + Math.pow((this.y1 - this.y2), 2));
        double distance2 = Math.sqrt(Math.pow((this.x2 - this.x3), 2) + Math.pow((this.y2 - this.y3), 2));
        double distance3 = Math.sqrt(Math.pow((this.x1 - this.x3), 2) + Math.pow((this.y1 - this.y3), 2));

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
