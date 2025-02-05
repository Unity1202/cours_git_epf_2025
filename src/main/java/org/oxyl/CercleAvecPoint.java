package org.oxyl;
// $$$$$$$$$$$

public class CercleAvecPoint extends AUnCentre{
    //Attributs
    private double rayon;

    //Contructeurs
    public CercleAvecPoint(Point point, double rayon) {
        super(point);
        this.rayon = Math.max(rayon, 0);
    }
    public CercleAvecPoint() {
        super(new Point());
        this.rayon = 1.0;
    }
    public CercleAvecPoint(CercleAvecPoint cercle) {
        super(cercle.getCentre());
        this.rayon = cercle.rayon;
    }

    //Methodes
    public void deplacer(double distanceX, double distanceY){
        this.centre.setCentre( + distanceX);
        this.centre.setY(this.centre.getY() + distanceY);
    }

    public boolean isGrand(){
        return this.rayon > 100;
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
