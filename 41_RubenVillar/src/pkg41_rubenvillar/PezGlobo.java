/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg41_rubenvillar;

import javax.swing.JOptionPane;

/**
 *
 * @author PCC08
 */
public class PezGlobo {

    String pz;
    String vn;
    String hb;
    String cd;
    String cz;

    
     public void preguntar(){
    pz = JOptionPane.showInputDialog("Ingrse el nombre del animal: ") ;
    vn = JOptionPane.showInputDialog("Su veneno es el mas: ") ;
    cd = JOptionPane.showInputDialog("Su comida favorita es: ") ;
    cz = JOptionPane.showInputDialog("Ellos son cazados por: ") ;
 
    }
     public void responde(){
    JOptionPane.showMessageDialog(null,"El nombre es: "+pz);
    JOptionPane.showMessageDialog(null,"Su veneno is: "+vn);
    JOptionPane.showMessageDialog(null,"Ellos comen: "+cd);
    JOptionPane.showMessageDialog(null,"Le temen a los: "+cz);
    }
}
