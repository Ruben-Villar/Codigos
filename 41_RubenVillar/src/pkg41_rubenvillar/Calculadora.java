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
public class Calculadora {
    //atributos     
    int a;
    int b;
    int totals;
    int totalr;
    int totald;
    int totalm;
    //Multiplicar:
     public void preguntar(){
        Scanner o =new Scanner(System.in);
     System.out.println("Ingrese el primer numero: ");   
     a = o.nextInt();
   
    System.out.println("Ingrese el segundo numero: ");
     b = o.nextInt();
    
    }
    public void multiplicar(){
    totalm = a*b;
        System.out.println("La multiplicaion es: "+totalm);
    }
    public void sumar(){
    totals = a+b;
        System.out.println("La suma es: "+totals);
    }
    public void restar(){
    totalr = a-b;
        System.out.println("La resta es: "+totalr);
    }
    public void dividir(){
    totald =a/b;
        System.out.println("La division es : "+totald);
    }
   
    public void responde(){
    JOptionPane.showMessageDialog(null,"La suma yis: "+totals);
    JOptionPane.showMessageDialog(null,"La resta yis: "+totalr);
    JOptionPane.showMessageDialog(null,"La multiplicacion yis: "+totalm);
    JOptionPane.showMessageDialog(null,"La division yis: "+totald);
    }
}
