/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import javax.swing.JOptionPane;

/**
 *clase display para mostrar mensaxes por pantalla 
 * @author jdominguezmartinan
 * @version 1.0
 */
public class Display
{
    /**
     * metodo para mostrar o mensaxe en pantalla no momento de elaboracion da bebida 
     */
    public static void elaborar(){
        JOptionPane.showMessageDialog(null,"elaborando bebida","elaborando bebida",JOptionPane.OK_OPTION); // mensaxe a mostrar 
    }
    /**
     * metodo para mostrar o precio dun producto cando, o cliente da na tecla do producto e o credito non e suficiente para elaborala
     * @param pro producto seleccionado polo cliente 
     */
    public static void mostrarPrecio(Productos pro){
        JOptionPane.showMessageDialog(null,"precio da bebida "+pro.getPrecio()+" €");
    }
    /**
     * metodo para mostrar en pantalla a cantidade de azucar que esta definida para o producto 
     *
     */
    public static void mostrarAzucar(){
        JOptionPane.showMessageDialog(null,"azucar: "+Azucar.cantidad); // mensaxe a mostrar 
    }
    /**
     * metodo para mostrar o saldo dispoñible dentro da maquina 
     *
     */
    public static void mostrarCredito(){
        JOptionPane.showMessageDialog(null,"tu credito es de: "+Monedero.credito);// mensaxe a mostrar 
    }
    /**
     * metodo para mostrar o cambio que o cliente ten que recoller tras elaborarse a bebida 
     * 
     */
    public static void mostrarCambio(){
        JOptionPane.showMessageDialog(null,"recoja su cambio: "+Monedero.cambio);// mensaxe a mostrar 
    }
    /**
     *metodo para mostrar por pantalla que recolla os cartos insertados cando o usuario preme o boton relativo a esta funcion 
     */
    public static void devolverCredito(){
        JOptionPane.showMessageDialog(null,"recoja su dinero");// mensaxe a mostrar 
    }
    
}
