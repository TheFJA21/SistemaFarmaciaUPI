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
public class Facturacion {
    public int numero, fecha, cedCliente, codEmpleado, cantidad,codFarmaco, precio, subtotal;
    public double impuesto, totalFinal;

    public Facturacion() {
    }

    public Facturacion(int numero, int fecha, int cedCliente, int codEmpleado, int cantidad, int codFarmaco, int precio, int subtotal, double impuesto, double totalFinal) {
        this.numero = numero;
        this.fecha = fecha;
        this.cedCliente = cedCliente;
        this.codEmpleado = codEmpleado;
        
        this.cantidad = cantidad;
        this.codFarmaco = codFarmaco;
        this.precio = precio;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.totalFinal = totalFinal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(int cedCliente) {
        this.cedCliente = cedCliente;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

   

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodFarmaco() {
        return codFarmaco;
    }

    public void setCodFarmaco(int codFarmaco) {
        this.codFarmaco = codFarmaco;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }
    
    public void arrayFactura(){
        ArrayList factura = new ArrayList();
        
    }
    
    public ArrayList array(){
        ArrayList factura = new ArrayList();
        return factura;
    }
}
