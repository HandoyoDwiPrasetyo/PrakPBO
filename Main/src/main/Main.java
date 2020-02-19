/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanInput = new Scanner(System.in); 
        Hewan hewan = new Hewan();
        System.out.print("Masukkan Tinggi : ");
        int tinggi = scanInput.nextInt();
        hewan.setTinggi(tinggi);
        System.out.println("Tinggi : " + hewan.getTinggi());
    }
    
}
