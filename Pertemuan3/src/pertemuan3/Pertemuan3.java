/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class Pertemuan3 extends lingkaran{
        
    /**
     * @param args the command line arguments
     */
    
    public double volume(){
        return super.luas(10, 3.14);
    }
    public static void main(String[] args) {
        Pertemuan3 p = new Pertemuan3();
        System.out.println(p.volume());
    }
    
}
