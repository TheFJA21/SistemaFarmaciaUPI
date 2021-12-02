/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author E7240
 */
import java.util.ArrayList;
public class Pedido {
   public String sucursal;
   public int cantidad, codFarmaco;
    public Pedido() {
    }

    public Pedido(int codFarmaco, String sucursal, int cantidad) {
        this.codFarmaco = codFarmaco;
        this.sucursal = sucursal;
        this.cantidad = cantidad;
    }

    public int getCodFarmaco() {
        return codFarmaco;
    }

    public void setCodFarmaco(int codFarmaco) {
        this.codFarmaco = codFarmaco;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void arrayPedido(){
        ArrayList pedido = new ArrayList();
        
    }   
    
    public ArrayList array(){
        ArrayList pedido = new ArrayList();
        return pedido;
    }
}
