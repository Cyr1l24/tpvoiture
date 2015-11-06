/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsmu;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author EPSI
 */
public class Carrefour extends Observable {

    protected ArrayList<Voiture> voitures;

    public Carrefour() {
        voitures = new ArrayList();
        Timer minuteur = new Timer();
        TimerTask tache;
        tache = new TimerTask() {
            public void run() {
                voitures.add(new Voiture(1, 1, 322, 550));                
            }
        };
        minuteur.schedule(tache, 0, 3000);

    }

    protected void MiseAJourVoiture() {
        for(Voiture v : voitures) {
            v.MiseAJourPosition(-1, 0);
        }
    }

    public void MiseAJourCarrefour() {
        /*MiseAJourObstacles();
         MiseAJourPoissons();
         */
        MiseAJourVoiture();
        setChanged();
        notifyObservers();
    }

}
