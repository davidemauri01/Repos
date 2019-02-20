/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davide Mauri
 */
public class MyThread extends Thread{
    private DatiCondivisi d;
    private Integer numThread;
    
    public MyThread(DatiCondivisi d, int numThread){
        this.d = d;
        this.numThread = numThread;
    }
    
    @Override
    public void run(){
            while(!isInterrupted()){
                d.stampaSuono(numThread);
            }        
    }
}
