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
import java.util.ArrayList; //libreria del arrayList
public class Cliente {
    public String nombreCliente, direccion, correo, fecha, genero;
    public int cedCliente, telefono, edad;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String direccion, String correo, int cedCliente, int telefono, int edad, String fecha, String genero) {
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.correo = correo;
        this.cedCliente = cedCliente;
        this.telefono = telefono;
        this.edad = edad;
        this.fecha = fecha;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(int cedCliente) {
        this.cedCliente = cedCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    //metodo procedimiento
    public void arrayCliente(){
        ArrayList cliente = new ArrayList();
    }
    //funcion
    public ArrayList array(){
        ArrayList cliente = new ArrayList();
    return cliente;
    }
}
