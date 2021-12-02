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
public class Farmaco {
    public int precio, cantidad, categoria,codFarmaco;
    public String nomFarmaco, descripcion;

    public Farmaco() {
    }

    public Farmaco(int precio, int cantidad, int categoria,int codFarmaco, String nomFarmaco, String descripcion) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.codFarmaco = codFarmaco;
        this.nomFarmaco = nomFarmaco;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getcodFarmaco() {
        return codFarmaco;
    }

    public void setcodFarmaco(int codFarmaco) {
        this.codFarmaco = codFarmaco;
    }

    public String getNomFarmaco() {
        return nomFarmaco;
    }

    public void setNomFarmaco(String nomFarmaco) {
        this.nomFarmaco = nomFarmaco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void arrayFarmaco(){
        ArrayList farmaco = new ArrayList();
        
    }   
    
    public ArrayList array(){
        ArrayList farmaco = new ArrayList();
        return farmaco;
    }
}
