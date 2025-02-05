package org.oxyl;

public class Rectangle {
    //Attributs
    private double centreX;
    private double centreY;
    private double longueur;
    private double largeur;
    private double angle;
    
    //Constructeurs
    public Rectangle(double centreX, double centreY, double longueur, double largeur, double angle) {
        this.centreX = centreX;
        this.centreY = centreY;
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
    public Rectangle(){
        this.centreX = 0.0;
        this.centreY = 0.0;
        this.longueur = 1.0;
        this.largeur = 1.0;
        this.angle = 0.0;
    }
    public Rectangle(Rectangle rectangle){
        this.centreX = rectangle.centreX;
        this.centreY = rectangle.centreY;
        this.longueur = rectangle.longueur;
        this.largeur = rectangle.largeur;
        this.angle = rectangle.angle;
    }

    //Methodes
    public void deplacer(double distanceX, double distanceY){
        this.centreX += distanceX;
        this.centreY += distanceY;
    }
    
    public boolean isCarre(){
        if (this.largeur == this.longueur){
            return true;
        }
        return false;
    }
    
    public void redimensionner(double f){
        if (f<0){
            this.longueur = 0;
            this.largeur = 0;
        }
        else{
            this.largeur *= f;
            this.longueur *= f;
        }
    }
    
    public void tourner(double theta){
        this.angle += theta;
    }
}
