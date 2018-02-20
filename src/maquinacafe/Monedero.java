/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

/**
 * clase estatica para definir o monedero
 * @author jdominguezmartinan
 * @version 1.0
 */
public class Monedero {
/**
 * o monedero vai ter un credito que e o que ten o cliente para poder mercar 
 * o monedero vai ter un cambio que sera de cero ata que o cliente merque, o credito pasara a ser cero e o cambio a diferencia entre precio e credito, cando se expulse da maquina volvera a ser cero 
 */
    public static float credito = 0;
    public static float cambio = 0;

}
