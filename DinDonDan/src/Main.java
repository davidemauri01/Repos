
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davide Mauri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi d = new DatiCondivisi();
        MyThread Din = new MyThread(d, 0);
        MyThread Don = new MyThread(d, 1);
        MyThread Dan = new MyThread(d, 2);
        Scanner s = new Scanner(System.in);
        
        
        try{
            Din.start();
            Don.start();
            Dan.start();
            
            s.next();
            
            Din.interrupt();
            Din.join();
            Don.interrupt();
            Don.join();
            Dan.interrupt();
            Dan.join();
        }catch(InterruptedException e){
            System.out.print(e);
        }
        
    }
    
}
