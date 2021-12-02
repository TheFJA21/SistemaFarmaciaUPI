package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E7240
 */
import java.util.ArrayList;
public class Estado {
    public int codFarmaco;
    public String codEstado;

    public Estado() {
    }

    public Estado(int codFarmaco, String codEstado) {
        this.codEstado = codEstado;
        this.codFarmaco = codFarmaco;
    }

    public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    public int getCodFarmaco() {
        return codFarmaco;
    }

    public void setCodFarmaco(int codFarmaco) {
        this.codFarmaco = codFarmaco;
    }
    
    public void arrayEstado(){
        
        ArrayList estado = new ArrayList();
        
    }
    
    public ArrayList array(){
        ArrayList estado = new ArrayList();
        return estado;
    }
}
