/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpsmu;

/**
 *
 * @author EPSI
 */
public class Voie {
    public static double largeur = 60 ;
    public static double hauteur = 200;
    public double orientation; // 0 = N ; 1 = E ; 2 = S ; 3 = O
    public double posX;
    public double posY;

    public Voie(double orientation, double posX, double posY) {
        this.orientation = orientation;
        this.posX = posX;
        this.posY = posY;
    }

    public static double getLargeur() {
        return largeur;
    }

    public static void setLargeur(double largeur) {
        Voie.largeur = largeur;
    }

    public static double getHauteur() {
        return hauteur;
    }

    public static void setHauteur(double hauteur) {
        Voie.hauteur = hauteur;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }
    
    
    
}
