
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author panto_mattia
 */
public class gestioneFileBinari{
    ArrayList<cBottiglia> bottiglia = new ArrayList<cBottiglia>();
    String percorsoFile = "";
    
    public gestioneFileBinari(String percorso) throws IOException, ClassNotFoundException {
        percorsoFile = percorso;
        FileInputStream fi = null;
        cBottiglia temp = new cBottiglia();
        try {
            fi = new FileInputStream(new File(percorso));
            ObjectInputStream oi = new ObjectInputStream(fi);
            
            while(fi.available() > 0){
                temp = (cBottiglia) oi.readObject();
                bottiglia.add(temp);
                
            }   
            
            oi.close();
            fi.close();            
        } catch (Exception ex) {   
            System.out.println(ex);
        }
        
    }
    
    public void aggiungi(cBottiglia p){
        bottiglia.add(p);
    }
    public void elimina(cBottiglia bott){
        bottiglia.remove(bott);
    }
    public void modifica(cBottiglia p, int pos){
        bottiglia.set(pos, p);
    }
    public cBottiglia leggi(int pos){
        return bottiglia.get(pos);
    }
    public int numElementi(){
        return bottiglia.size();
    }
    public void salva(){
        FileOutputStream f = null;
        try {
            f = new FileOutputStream(new File(percorsoFile));
            ObjectOutputStream o = new ObjectOutputStream(f);
            //Salvo persone sul file
            for(int i = 0; i < bottiglia.size(); i++){
                o.writeObject(bottiglia.get(i));
            }
            o.close();
            f.close();
            
            
            
        } catch (Exception ex) {           
        }
    }
    
}
