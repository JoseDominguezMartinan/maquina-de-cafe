/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

/**
 * clase para os obxetos de tipo producto
 * @author jdominguezmartinan
 * @version 1.0
 */
public class Productos
{
    /**
     * o producto tera un nome que esta declarado co atributo producto
     * e un precio que esta declarado co atributo precio 
     */
    public String producto;
    public float precio;
/**
 * constructor por defecto
 */
    public Productos()
    {
    }
/**
 * constructor por parametros
 * @param producto nome do producto 
 * @param precio precio do prodcuto
 */
    public Productos(String producto,float precio)
    {
        this.producto = producto;
        this.precio = precio;
    }
/**
 * metodo para devolver o nome do producto , get
 * @return  producto nome do producto 
 */
    public String getProducto()
    {
        return producto;
    }
    /**
     * metodo para introducir un nome ao producto , get
     * @param producto nome do producto 
     */

    public void setProducto(String producto)
    {
        this.producto = producto;
    }
    /**
     * metodo para devolver o precio do producto , set
     * @return precio precio do producto
     */

    public float getPrecio()
    {
        return precio;
    }
    /**
     * metodo para modificar o precio do producto, set 
     * @param precio precio do producto 
     */

    public void setPrecio(float precio)
    {
        this.precio = precio;
    }
/**
 * toString mensaxe a mostrar 
 * @return mensaxe
 */
    @Override
    public String toString()
    {
        return "Productos{"+"producto="+producto+", precio="+precio+'}';
    }
    
    
    
}
