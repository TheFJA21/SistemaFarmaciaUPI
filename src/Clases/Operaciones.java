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
import javax.swing.*;
public class Operaciones {
    public static ArrayList<Cliente> array_Cliente = new ArrayList<Cliente>();

public void agregar(String nombreCliente, String direccion, String correo, int cedCliente, int telefono, int edad, String fecha, String genero){

//instanciar la clase
Cliente cli = new Cliente();

cli.setCedCliente(cedCliente);
cli.setCorreo(correo);
cli.setDireccion(direccion);
cli.setNombreCliente(nombreCliente);
cli.setTelefono(telefono);
cli.setEdad(edad);
cli.setFecha(fecha);
cli.setGenero(genero);
array_Cliente.add(cli);
JOptionPane.showMessageDialog(null, "Ingresaste con exito los datos");

    
}
// funcion para saber la posicion de un cliente
public Cliente getCliente(int index){
    return (Cliente)array_Cliente.get(index);
            
}
//funcion encuentra cliente
public int encuentraCliente(int cedCliente){
    int index = -1;
    for(int i=0;i<array_Cliente.size();i++){
        Cliente clien = (Cliente)array_Cliente.get(i);
        if(clien.getCedCliente()== cedCliente)
            index=i;
        
    }
    JOptionPane.showMessageDialog(null, "Datos encontrados");
    return index;
    
}
public void modificar(int index,String nombreCliente, String direccion, String correo, int cedCliente, int telefono, int edad, String fecha, String genero){

Cliente cli = new Cliente();

cli.setCedCliente(cedCliente);
cli.setCorreo(correo);
cli.setDireccion(direccion);
cli.setNombreCliente(nombreCliente);
cli.setEdad(edad);
cli.setTelefono(telefono);
cli.setFecha(fecha);
cli.setGenero(genero);
array_Cliente.set(index,cli);
JOptionPane.showMessageDialog(null, "Modificaste con exito los datos");

    
}
public static ArrayList<Empleado> array_Empleado = new ArrayList<Empleado>();
public void agregar(int codEmpleado, String nombre, String departamento){
//instanciar la clase
Empleado emp = new Empleado();

emp.setCodEmpleado(codEmpleado);
emp.setNombre(nombre);
emp.setDepartamento(departamento);
array_Empleado.add(emp);
JOptionPane.showMessageDialog(null, "Ingresaste con exito los datos");

    
}
// funcion para saber la posicion de un cliente
public Empleado getEmpleado(int index){
    return (Empleado)array_Empleado.get(index);
            
}
//funcion encuentra cliente
public int encuentraEmpleado(int codEmpleado){
    int index = -1;
    for(int i=0;i<array_Empleado.size();i++){
        Empleado emple = (Empleado)array_Empleado.get(i);
        if(emple.getCodEmpleado()== codEmpleado)
            index=i;
            
    
    }
    JOptionPane.showMessageDialog(null, "Datos encontrados");
    return index;
    
}
//metodo modificar
public void modificar(int index, int codEmpleado, String nombre, String departamento){

//instanciar la clase
Empleado emp = new Empleado();

emp.setCodEmpleado(codEmpleado);
emp.setNombre(nombre);
emp.setDepartamento(departamento);
array_Empleado.set(index,emp);
JOptionPane.showMessageDialog(null, "Modificaste con exito los datos");

    
}

public static ArrayList<Farmaco> array_Farmaco = new ArrayList<Farmaco>();

public void agregar(int precio, int cantidad, int categoria, int codFarmaco, String nomFarmaco, String descripcion){
    
    Farmaco fa = new Farmaco();
    fa.setCantidad(cantidad);
    fa.setCategoria(categoria);
    fa.setDescripcion(descripcion);
    fa.setNomFarmaco(nomFarmaco);
    fa.setPrecio(precio);
    fa.setcodFarmaco(codFarmaco);
    array_Farmaco.add(fa);
    JOptionPane.showMessageDialog(null, "Ingresaste datos con exito");
            
    
}
//funcion para saber la posicion de un farmaco
public Farmaco getFarmaco(int index){
    
    return (Farmaco) array_Farmaco.get(index);
}
//funcion para encontrar al Farmaco
public int encuentraFarmaco(int codFarmaco){
    int index = -1;
    for(int i=0;i<array_Farmaco.size();i++){
        Farmaco farm = (Farmaco)array_Farmaco.get(i);
        if(farm.getcodFarmaco()== codFarmaco)
            index=i;
        
    
    }
    JOptionPane.showMessageDialog(null, "Farmaco encontrado");    
    return index;
    
}
//metodo modificar
public void modificar(int index, int precio, int cantidad, int categoria, int codFarmaco, String nomFarmaco, String descripcion){

//instanciar la clase
Farmaco far = new Farmaco();
far.setCantidad(cantidad);
far.setCategoria(categoria);
far.setDescripcion(descripcion);
far.setNomFarmaco(nomFarmaco);
far.setPrecio(precio);
far.setcodFarmaco(codFarmaco);
array_Farmaco.set(index, far);
JOptionPane.showMessageDialog(null, "Modificaste con exito los datos");
    

}

public static ArrayList<Departamento> array_Departamento = new ArrayList<Departamento>();

public void agregar(String nombre, int codigo){
    Departamento dep = new Departamento();
    
    dep.setCodigo(codigo);
    dep.setNombre(nombre);
    array_Departamento.add(dep);
    JOptionPane.showMessageDialog(null, "Ingresaste con exito los datos");
    
    
    
}

// funcion para saber la posicion del departamento

public Departamento getDepartamento(int index){
    return (Departamento) array_Departamento.get(index);
}

//funcion para encontrar departamento
public int encuentraDepartamento(int codigo){
    int index = -1;
    for(int i=0;i<array_Departamento.size();i++){
        Departamento depa = (Departamento)array_Departamento.get(i);
        if(depa.getCodigo()== codigo)
            index=i;
        
    }
    JOptionPane.showMessageDialog(null, "Datos encontrados");
    return index;
}
//metodo para modificar
public void modificar(int index, String nombre, int codigo){
    
    Departamento dep = new Departamento();
    dep.setCodigo(codigo);
    dep.setNombre(nombre);
    array_Departamento.set(index, dep);
    JOptionPane.showMessageDialog(null, "Modificaste con exito los datos");
    
}

public static ArrayList<Bodega> array_Bodega = new ArrayList<Bodega>();

public void agregar(int codFarmaco, String codEstado, int cantidad, String sucursal){
    
    Bodega bod = new Bodega();
    bod.setCantidad(cantidad);
    bod.setCodEstado(codEstado);
    bod.setCodFarmaco(codFarmaco);
    bod.setSucursal(sucursal);
    array_Bodega.add(bod);
    JOptionPane.showMessageDialog(null, "Ingresaste con exito los datos");
    
    
}

//funcion para saber la posicion de bodega
public Bodega getBodega(int index){
    return (Bodega) array_Bodega.get(index);
}

//funcion para encontrar bodega

public int encuentraBodega(int codFarmaco){
    int index= -1;
    for(int i=0;i<array_Bodega.size();i++){
        Bodega bode = (Bodega)array_Bodega.get(i);
        if(bode.getCodFarmaco()== codFarmaco)
            index=i;
    }
    JOptionPane.showMessageDialog(null, "Datos encontrados");
    return index;
}

//modificar
public void modificar(int index, int codFarmaco, String codEstado, int cantidad, String sucursal){
    
    Bodega bod = new Bodega();
    bod.setCantidad(cantidad);
    bod.setCodEstado(codEstado);
    bod.setCodFarmaco(codFarmaco);
    bod.setSucursal(sucursal);
    array_Bodega.set(index, bod);
    JOptionPane.showMessageDialog(null, "Modificaste con exito los farmacos en bodega");
    
}

public static ArrayList<Categoria> array_Categoria = new ArrayList<Categoria>();

public void agregar(String nombre, int codigo, String categoria){
    
    Categoria cat = new Categoria();
    cat.setCategoria(categoria);
    cat.setCodigo(codigo);
    cat.setNombre(nombre);
    array_Categoria.add(cat);
    JOptionPane.showMessageDialog(null, "Ingresaste con exito los datos");
    
}
// funcion para saber la posicion
public Categoria getCategoria(int index){
    return (Categoria)array_Categoria.get(index);
}
public int encuentraCategoria(int codigo){
    int index= -1;
    for(int i=0;i<array_Categoria.size();i++){
        Categoria cate = (Categoria)array_Categoria.get(i);
        if(cate.getCodigo()== codigo)
            index=i;
    }
    JOptionPane.showMessageDialog(null, "Datos encontrados");
    return index;
}
//modificar

public void modificar(int index, String nombre, int codigo, String categoria){
    
    Categoria cat = new Categoria();
    
    cat.setCategoria(categoria);
    cat.setCodigo(codigo);
    cat.setNombre(nombre);
    array_Categoria.set(index, cat);
    JOptionPane.showMessageDialog(null, "Modificaste con exito los datos");
        
    
    
}

public static ArrayList<Estado> array_Estado = new ArrayList<Estado>();

public void agregar(int codFarmaco, String codEstado){
    
    Estado est = new Estado();
    est.setCodEstado(codEstado);
    est.setCodFarmaco(codFarmaco);
    array_Estado.add(est);
    JOptionPane.showMessageDialog(null, "Ingresaste los datos con exito");
    
}
// funcion para en  saber posicion

public Estado getEstado(int index){
    
    return (Estado) array_Estado.get(index);
    
}
//funcion

public int encuentraEstado(int codFarmaco){
    int index= -1;
    for(int i=0; i<array_Estado.size();i++){
        Estado esta = (Estado)array_Estado.get(i);
        if(esta.getCodFarmaco()==codFarmaco)
            index=i;
        
        
    }
    JOptionPane.showMessageDialog(null, "Datos encontrados");
    return index;
    
}

//modificar
public void modificar(int index, int codFarmaco, String codEstado){
    Estado est = new Estado();
    est.setCodEstado(codEstado);
    est.setCodFarmaco(codFarmaco);
    array_Estado.set(index, est);
    JOptionPane.showMessageDialog(null, "Modificaste con exito los datos");
}


public static ArrayList<Pedido> array_Pedido = new ArrayList<Pedido>();

public void agregar(int codFarmaco, String sucursal, int cantidad){
    
    Pedido ped = new Pedido();
    ped.setCantidad(cantidad);
    ped.setCodFarmaco(codFarmaco);
    ped.setSucursal(sucursal);
    array_Pedido.add(ped);
    JOptionPane.showMessageDialog(null, "Ingresaste los datos con exito");
    
}

//funcion para encontrar posicion

public Pedido getPedido(int index){
    return (Pedido)array_Pedido.get(index);
    
    
}

//funcion encuentra

public int encuentraPedido(int codFarmaco){
    int index = -1;
    for(int i=0; i<array_Pedido.size();i++){
        
        Pedido pedi = (Pedido)array_Pedido.get(i);
        if(pedi.getCodFarmaco()==codFarmaco)
            index=i;
        
    }
    JOptionPane.showMessageDialog(null, "Datos encontrados");
    return index;
}

//modificar

public void modificar(int index, int codFarmaco, String sucursal, int cantidad){
    
    Pedido ped = new Pedido();
    ped.setCantidad(cantidad);
    ped.setCodFarmaco(codFarmaco);
    ped.setSucursal(sucursal);
    array_Pedido.set(index, ped);
    JOptionPane.showMessageDialog(null, "Modificaste los datos con exito");
    
    
}

public static ArrayList<Facturacion> array_Factura = new ArrayList<Facturacion>();
public void agregar(int numero, int fecha, int cedCliente, int codEmpleado, int cantidad, int codFarmaco, int precio, int subtotal, double impuesto, double totalFinal){
Facturacion fac = new Facturacion();

fac.setCantidad(cantidad);
fac.setCedCliente(cedCliente);

fac.setCodEmpleado(codEmpleado);
fac.setCodFarmaco(codFarmaco);
fac.setFecha(fecha);
fac.setImpuesto(impuesto);
fac.setNumero(numero);
fac.setSubtotal(subtotal);
fac.setPrecio(precio);
fac.setTotalFinal(totalFinal);
array_Factura.add(fac);
JOptionPane.showMessageDialog(null, "Ingresaste los datos con exito");

}

//funcion para saber posicion
public Facturacion getFacturacion(int index){
    return (Facturacion)array_Factura.get(index);
    
}
//encontrar posicion

public int encuentraFacturacion(int numero){
    int index = -1;
    for(int i=0; i<array_Factura.size();i++){
        
        Facturacion fact = (Facturacion)array_Factura.get(i);
        if(fact.getNumero()== numero)
            index=i;
        
    }
    JOptionPane.showMessageDialog(null, "Datos encontrados");
    return index;
}

//modificar

public void modificar(int index, int numero, int fecha, int cedCliente, int codEmpleado, int cantidad, int codFarmaco, int precio, int subtotal, double impuesto, double totalFinal){
    
Facturacion fac = new Facturacion();
fac.setCantidad(cantidad);
fac.setCedCliente(cedCliente);

fac.setCodEmpleado(codEmpleado);
fac.setCodFarmaco(codFarmaco);
fac.setFecha(fecha);
fac.setImpuesto(impuesto);
fac.setNumero(numero);
fac.setPrecio(precio);
fac.setSubtotal(subtotal);
fac.setTotalFinal(totalFinal);
array_Factura.set(index, fac);
JOptionPane.showMessageDialog(null, "Modificaste los datos con exito");
}
}