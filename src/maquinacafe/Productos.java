/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

/**
 *
 * @author jdominguezmartinan
 */
public class Productos
{
    public String producto;
    public float precio;

    public Productos()
    {
    }

    public Productos(String producto,float precio)
    {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto()
    {
        return producto;
    }

    public void setProducto(String producto)
    {
        this.producto = producto;
    }

    public float getPrecio()
    {
        return precio;
    }

    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        return "Productos{"+"producto="+producto+", precio="+precio+'}';
    }
    
    
    
}
