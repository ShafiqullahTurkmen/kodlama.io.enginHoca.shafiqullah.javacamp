
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shafi
 */
public class Main {
    public static void main(String[] args) {
        String[] channels = {"Radio Viva", "Radio Fenomen", "Kral Pop", "Radio Afghan"};
        Radio radio = new Radio(channels);
        
        for (String s : radio) {
            System.out.println(s);
        }
        
        System.out.println("*******************************");
        
        Iterator<String> iterator = radio.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
        
        
    }
}
