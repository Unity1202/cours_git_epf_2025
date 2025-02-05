package org.oxyl;

public class RectangleAvecPoint extends AUnCentre{
    //Attributs
    private AUnCentre centre;
    private double longueur;
    private double largeur;
    private double angle;

    //Constructeurs
    public RectangleAvecPoint(Point centre, double longueur, double largeur, double angle) {
        super(centre);
        if (longueur<0){
            this.longueur = 0;
        }
        else{
            this.longueur = longueur;
        }
        if (largeur<0){
            this.largeur = 0;
        }
        else{
            this.largeur = largeur;
        }
        this.angle = angle;
    }
    public RectangleAvecPoint(){
        super();
        this.longueur = 1.0;
        this.largeur = 1.0;
        this.angle = 0.0;
    }
    public RectangleAvecPoint(RectangleAvecPoint rectangle){
        super(rectangle.centre);
        this.longueur = rectangle.longueur;
        this.largeur = rectangle.largeur;
        this.angle = rectangle.angle;
    }

    //Methodes
    public void deplacer(double distanceX, double distanceY){
        this.centre.setX(this.centre.getX() + distanceX);
        this.centre.setY(this.centre.getY() + distanceY);
    }

    public boolean isCarre(){
        if (this.largeur == this.longueur){
            return true;
        }
        return false;
    }

    public void redimensionner(double f){
        this.largeur *= f;
        this.longueur *= f;
    }

    public void tourner(double theta){
        this.angle += theta;
    }
}

