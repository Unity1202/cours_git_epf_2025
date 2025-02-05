package org.oxyl;

public abstract class AUnCentre {
    //Attributs
    protected Point centre;

    //Constructeurs
    public AUnCentre(Point centre) {
        this.centre = centre;
    }
    public AUnCentre(AUnCentre aUnCentre){
        this.centre = new Point(aUnCentre.centre);
    }

    //Methodes
    public Point getCentre() {
        return new Point(this.centre);
    }
    public void setCentre(Point centre) {
        this.centre = new Point(centre);
    }

    public abstract void deplacer(double distanceX, double distanceY);
    public abstract boolean isCarre();
    public abstract void redimensionner(double f);
    public abstract void tourner(double theta);
}