
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
public class MyThread extends Thread{
    private DatiCondivisi d;
    private Integer numThread;
    private Semaphore s;
    private Semaphore sThSuccessivo;
    
    public MyThread(DatiCondivisi d, int numThread,Semaphore s, Semaphore sThSuccessivo){
        this.d = d;
        this.numThread = numThread;
        this.s = s;
        this.sThSuccessivo = sThSuccessivo;
    }
    
    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                s.acquire();
                d.stampaSuono(numThread);
                sThSuccessivo.release();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
