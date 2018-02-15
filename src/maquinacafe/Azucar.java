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
public class Azucar
{
    public int cantidad=3;

    public Azucar()
    {
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    @Override
    public String toString()
    {
        return "Azucar{"+"cantidad="+cantidad+'}';
    }
    
    public void masAzucar(){
        cantidad=cantidad+1;
    }
    public void menosAzucar(){
        cantidad=cantidad-1;
    }
    
}
