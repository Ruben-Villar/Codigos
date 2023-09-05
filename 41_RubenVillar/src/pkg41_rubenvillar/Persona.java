/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg41_rubenvillar;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PCC08
 */
public class Persona {

    //atributos
    String nombre;
    int edad;
    //metodos

    public void preguntar3() {
        Scanner o =new Scanner(System.in);
        String nombre = o.nextLine();
        String edad = o.nextLine();
    }

    public void responder3() {
        JOptionPane.showMessageDialog(null, "HOLA FERXXO , contraseña:" + nombre + edad);
        JOptionPane.showMessageDialog(null, "Levanta la mano neto mi club es : " + nombre + " " + edad);
    }
}
