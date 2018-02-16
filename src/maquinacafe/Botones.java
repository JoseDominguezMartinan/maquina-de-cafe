/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import javax.swing.JOptionPane;
import com.datos.LerDatos;
import java.util.ArrayList;

/**
 *
 * @author jdominguezmartinan
 */
public class Botones
{
    Productos bebida;// declaramos un producto para su posterior utilizacion 
    int credito=0; // credito actual del usuario
    ArrayList<String>nomes;
    public void aumentarCredito(){ // a nosa maquina so admite moedas de un euro e este metodo e chamado cada vez que o usuario engade unha moeda
        credito=credito+1;
    }
    public void seleccionarBebida(){ // metodo chamado cando prememos o boton de seleccion de bebida
       
        nomes=LerDatos.listaProductos();
      
        int opcion=JOptionPane.showOptionDialog(null,"seleccione bebida","selección de bebida",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,nomes.toArray(),null);
        bebida=LerDatos.seleccionarObxeto(nomes.get(opcion));
         if(credito<bebida.getPrecio())
             Display.mostrarPrecio(bebida);
         else Display.elaborar();
        }
        
        
    }
    

