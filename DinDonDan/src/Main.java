
import java.util.Scanner;
import java.util.concurrent.Semaphore;

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
        Semaphore sDin = new Semaphore(1);
        Semaphore sDon = new Semaphore(0);
        Semaphore sDan = new Semaphore(0);
        DatiCondivisi d = new DatiCondivisi();
        MyThread Din = new MyThread(d, 0, sDin, sDon);
        MyThread Don = new MyThread(d, 1, sDon, sDan);
        MyThread Dan = new MyThread(d, 2, sDan, sDin);
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
