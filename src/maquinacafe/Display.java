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
public class Display
{
    public static void elaborar(){
        System.out.println("elaborando bebida");
    }
    public static void mostrarPrecio(Productos pro){
        System.out.println(pro.getPrecio());
    }
    
}
