/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpsmu;

import javax.swing.JFrame;

/**
 *
 * @author EPSI
 */
public class Application {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // Création de la fenêtre
        JFrame fenetre = new JFrame();
        fenetre.setTitle("Simulation de circulation");
        fenetre.setSize(600, 600);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(true); // false !!!
        // Création du contenu
        CarrefourJPanel panel = new CarrefourJPanel();
        fenetre.setContentPane(panel);
        // Affichage
        fenetre.setVisible(true);
        panel.Lancer();
    }
    
}
