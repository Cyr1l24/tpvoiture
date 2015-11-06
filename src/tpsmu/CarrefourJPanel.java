/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsmu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author EPSI
 */
public class CarrefourJPanel extends JPanel implements Observer {

    ;
    public Carrefour carrefour;
    public Timer timer;
    private BufferedImage img;

    public CarrefourJPanel() {
        this.setBackground(new Color(255, 255, 255));

        try {
            img = ImageIO.read(new File("C:\\Users\\EPSI\\Documents\\NetBeansProjects\\tpSMU\\src\\tpsmu\\tp voiture.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Lancer() {
        carrefour = new Carrefour();
        carrefour.addObserver(this);
        TimerTask tache = new TimerTask() {
            @Override
            public void run() {
                carrefour.MiseAJourCarrefour();
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tache, 0, 15);
    }

    protected void DessinerVoie(Voie v, Graphics g) {
        /* if ((int) v.orientation == 0) { //Nord
         g.drawLine((int) v.posX, (int) v.posY, (int) v.posX, (int) (v.posY + Voie.hauteur));
         g.drawLine((int) (v.posX + Voie.largeur), (int) v.posY, (int) (v.posX + Voie.largeur), (int) (v.posY + Voie.hauteur));
         }
         if (v.orientation == 1) {
         g.drawLine((int) v.posX, (int) v.posY, (int) v.posX, (int) (v.posY + Voie.hauteur));
         g.drawLine((int) (v.posX + Voie.largeur), (int) v.posY, (int) (v.posX + Voie.largeur), (int) (v.posY + Voie.hauteur));
         }
         if (v.orientation == 2) {
         g.drawLine((int) v.posX, (int) v.posY, (int) v.posX, (int) (v.posY + Voie.hauteur));
         g.drawLine((int) (v.posX + Voie.largeur), (int) v.posY, (int) (v.posX + Voie.largeur), (int) (v.posY + Voie.hauteur));
         }
         if (v.orientation == 3) {
         g.drawLine((int) v.posX, (int) v.posY, (int) v.posX, (int) (v.posY + Voie.hauteur));
         g.drawLine((int) (v.posX + Voie.largeur), (int) v.posY, (int) (v.posX + Voie.largeur), (int) (v.posY + Voie.hauteur));
         }*/

    }

    protected void DessinerVoiture(Voiture v, Graphics g) {
        //g.drawRect((int)v.posX, (int)v.posY, 20, 30);
        g.fillRect((int)v.posX, (int)v.posY, 20, 30);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //g.drawLine(0, 0, 50, 50);
        for (Voiture v : carrefour.voitures) {
            DessinerVoiture(v, g);
        }

        //int imageWight = fond.getWidth(this);
        //int imageHeight = fond.getHeight(this);
        g.drawImage(img, 0, 0, null);
        repaint();
    }

}
