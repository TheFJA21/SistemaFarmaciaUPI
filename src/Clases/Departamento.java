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
public class Departamento {
    public String nombre;
    public int codigo;

    public Departamento() {
    }

    public Departamento(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void arrayDepartamento(){
        ArrayList departamento = new ArrayList();
        
    }
    
    public ArrayList array(){
        
        ArrayList departamento = new ArrayList();
        return departamento;
    }
}
