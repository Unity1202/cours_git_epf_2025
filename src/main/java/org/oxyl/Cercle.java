package org.oxyl;

public class Cercle {
    //Attributs
    private double centreX;
    private double centreY;
    private double rayon;
    
    //Contructeurs
    public Cercle(double centreX, double centreY, double rayon) {
        this.centreX = centreX;
        this.centreY = centreY;
        if (rayon<0){
            this.setRayon(rayon);
        }
        else{
            this.rayon = rayon;
        }
    }
    public Cercle(){
        this.centreX = 0.0;
        this.centreY = 0.0;
        this.rayon = 1.0;
    }
    public Cercle(Cercle cercle){
        this.centreX = cercle.centreX;
        this.centreY = cercle.centreY;
        this.rayon = cercle.rayon;
    }

    //Methodes
    public void deplacer(double distanceX, double distanceY){
        this.centreX += distanceX;
        this.centreY += distanceY;
    } 
    
    public boolean isGrand(){
        if (this.rayon > 100){
            return true;
        }
        return false;
    }
    
    public void redimensionner(double f){
        if (f < 0){
            this.rayon = 0;
        }
        else{
            this.rayon *= f;
        }
    }
    
    public void tourner(double theta){
        System.out.println("Un cercle ne peut pas touner ! Hahaha");
    }
    
    private double setRayon(double rayon){
        return rayon = 0.0;
    }
    
}