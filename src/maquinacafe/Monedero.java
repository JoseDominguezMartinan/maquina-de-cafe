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
public class Monedero
{
    public float credito;
    public float cambio;

    public Monedero()
    {
    }

    public Monedero(float credito,float cambio)
    {
        this.credito = credito;
        this.cambio = cambio;
    }

    public float getCredito()
    {
        return credito;
    }

    public void setCredito(float credito)
    {
        this.credito = credito;
    }

    public float getCambio()
    {
        return cambio;
    }

    public void setCambio(float cambio)
    {
        this.cambio = cambio;
    }

    @Override
    public String toString()
    {
        return "Monedero{"+"credito="+credito+", cambio="+cambio+'}';
    }
    
    
}
