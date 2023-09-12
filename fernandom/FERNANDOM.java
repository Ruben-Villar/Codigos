/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernandom;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class FERNANDOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora1 ob = new Calculadora1();
        ob.sumar(7, 8);
        ob.restar(10, 2);
        ob.multi(9, 5);
        ob.div(100, 5);
        Calculadora2 ob1 = new Calculadora2();
        ob1.suma();
        ob1.restar();
        ob1.multi();
        ob1.div();
        
    }
    
}
