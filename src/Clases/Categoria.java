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
public class Categoria {
    public int codigo;
    public String nombre;
    public String categoria;
    
    public Categoria() {
    }

    public Categoria(int codigo, String nombre, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodo
    public void arrayCategoria(){
        
        ArrayList categ = new ArrayList();
        
    }
    
    public ArrayList array(){
        
        ArrayList categ = new ArrayList();
        return categ;
    }
}
