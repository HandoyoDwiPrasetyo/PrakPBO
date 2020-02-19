/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorpism;

/**
 *
 * @author Lab Informatika
 */
public class Polymorpism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan h = new Hewan();
        h.suara();
        Hewan a = new Anjing();
        a.suara();
        Hewan k = new Kucing();
        k.suara();
    }
    
}
