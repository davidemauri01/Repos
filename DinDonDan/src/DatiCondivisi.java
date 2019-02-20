/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davide Mauri
 */
public class DatiCondivisi {
    private String[] suono;
    
    public DatiCondivisi(){
        this.suono = new String[3];
        suono[0] = "Din";
        suono[1] = "Don";
        suono[2] = "Dan";
    }
    
    public synchronized void stampaSuono(int i){
        System.out.println(suono[i]);
    }
}
