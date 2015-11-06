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
public class Voiture {

    // Attributs
    protected double vitesseX;
    protected double vitesseY;
    public double posX;
    public double posY;

    public Voiture(double vitesseX, double vitesseY, double posX, double posY) {
        this.vitesseX = vitesseX;
        this.vitesseY = vitesseY;
        this.posX = posX;
        this.posY = posY;
    }

    public double getVitesseX() {
        return vitesseX;
    }

    public void setVitesseX(double vitesseX) {
        this.vitesseX = vitesseX;
    }

    public double getVitesseY() {
        return vitesseY;
    }

    public void setVitesseY(double vitesseY) {
        this.vitesseY = vitesseY;
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

    public void MiseAJourPosition(int sensY, int sensX) {
        posX += sensX * vitesseX;
        posY += sensY * vitesseY;
    }
}
