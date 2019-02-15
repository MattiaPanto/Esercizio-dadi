
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author panto_mattia
 */
public class cBottiglia implements Serializable{
    private String nome;
    private String casaVin;
    private String tipo;
    private String formato;
    private String annata;
    private String zona;
    

    public cBottiglia(String nome, String casaVin, String tipo, String formato, String annata, String zona) {
        this.nome = nome;
        this.casaVin = casaVin;
        this.tipo = tipo;
        this.formato = formato;
        this.annata = annata;
        this.zona = zona;
    }
    
    public cBottiglia() {
        this.nome = "";
        this.casaVin = "";
        this.tipo = "";
        this.formato = "";
        this.annata = "";
        this.zona = "";
    }

    public String getNome() {
        return nome;
    }

    public String getCasaVin() {
        return casaVin;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFormato() {
        return formato;
    }

    public String getAnnata() {
        return annata;
    }

    public String getZona() {
        return zona;
    }

    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCasaVin(String casaVin) {
        this.casaVin = casaVin;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setAnnata(String annata) {
        this.annata = annata;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
    
    
}
