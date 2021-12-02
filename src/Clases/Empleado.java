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
public class Empleado {
    public String nombre, departamento;
    public int codEmpleado;

    public Empleado() {
    }

    public Empleado(int codEmpleado, String nombre, String departamento) {
        this.nombre = nombre;
        this.codEmpleado = codEmpleado;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    //metodo procedimiento
    public void arrayEmpleado(){
        ArrayList cliente = new ArrayList();
        
    }
    //funcion
    public ArrayList array(){
        
        ArrayList cliente = new ArrayList();
        return cliente;
    }
    
    
}
