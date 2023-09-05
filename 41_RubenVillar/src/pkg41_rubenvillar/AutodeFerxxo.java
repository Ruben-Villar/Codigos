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
public class AutodeFerxxo {
    
    //Atributos
    String modelo;
    String kl;
    String color;
    String a;
    public void preguntar(){
    modelo = JOptionPane.showInputDialog("Cual es el modelo? ") ;
    kl = JOptionPane.showInputDialog("Cuantos kilometros tiene? ") ;
    color = JOptionPane.showInputDialog("Cual es el color del auto? ") ;
    a = JOptionPane.showInputDialog("Cual es su voltaje? ") ;
 
    }
   public void responde(){
   JOptionPane.showMessageDialog(null,"El Carro es: "+modelo+" Tiene de kilometro: "+kl+"Su color es: "+color+"Su voltaje es de: "+a);
  
    }

}
