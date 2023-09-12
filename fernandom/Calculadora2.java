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
public class Calculadora2 {
    //Atributos
    int o;
    int z;
    int j;
     public int z(){
    return 4;
    }
    public int j (){
    return 5;
    }
    public void suma(){
     o = z+j;
        System.out.println("Esto es una suma neto: "+o);
    }
    public void restar(){
     o = z-j;
        System.out.println("Esto es una resta neto: "+o);
    }
    public void div(){
     o = z/j;
        System.out.println("Esto es una div neto: "+ o);
    }
    public void multi(){
     o = z*j;
        System.out.println("Esto es una multi neto: "+ o);
    }
   
}
