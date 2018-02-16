/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import javax.swing.JOptionPane;
import com.datos.LerDatos;

/**
 *
 * @author jdominguezmartinan
 */
public class Botones
{
    LerDatos lectura=new LerDatos(); // obxeto de tipo LerDatos para chamar aos metodos desta clase cando se precise
    Productos bebida;// declaramos un producto para su posterior utilizacion 
    int credito=0; // credito actual del usuario
    public void aumentarCredito(){ // a nosa maquina so admite moedas de un euro e este metodo e chamado cada vez que o usuario engade unha moeda
        credito=credito+1;
    }
    public void seleccionarBebida(){ // metodo chamado cando prememos o boton de seleccion de bebida
        
    }
    
}
