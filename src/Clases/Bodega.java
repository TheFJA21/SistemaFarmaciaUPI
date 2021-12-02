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
public class Bodega {
    public int codFarmaco, cantidad;
    public String sucursal, codEstado;

    public Bodega() {
    }

    public Bodega(int codFarmaco, String codEstado, int cantidad, String sucursal) {
        this.codFarmaco = codFarmaco;
        this.codEstado = codEstado;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
    }

    public int getCodFarmaco() {
        return codFarmaco;
    }

    public void setCodFarmaco(int codFarmaco) {
        this.codFarmaco = codFarmaco;
    }

    public String getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    public void arrayBodega(){
        
        ArrayList bodega = new ArrayList();
    }
    
    public ArrayList array(){
        
        ArrayList bodega = new ArrayList();
        
        return bodega;
    }

}
