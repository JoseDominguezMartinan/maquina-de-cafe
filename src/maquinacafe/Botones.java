/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import com.datos.LerDatos;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * clase co menu de botons da nosa cafetera
 * @author jdominguezmartinan
 * @version 1.0
 */
public class Botones
{
/**
 *  declaramos un arrayList para os nomes dos nosos productos
 * 
 */
    ArrayList<String>nomes;
   boolean i=true; // booleano para facer un bucle repetitivo sen fin, dado que a maquina solo deixa de executar o programa se e desenchufada
   /**
    * metodo para facer o noso menu de interaccion co usuario 
    * non devolve nada nen se lle pasa ningun valor 
    */
    public void presionarBoton(){ // lista de botones de la maquina de cafe
        nomes=LerDatos.listaProductos(); // insertamos un boton por cada uno de los productos
        int tamaño=nomes.size(); // almacenamos a cantidade de productos que hay dispoñibles para que, ao ter mais botons no array, podamos facer os condicionais
        // insertamos no array os demais botons da maquina de cafe, para que o aspecto sexa o de unha maquina real no que podes ver todos os botons a vez
       nomes.add("Mas Azucar"); 
       nomes.add("Menos Azucar");
       nomes.add("Insertar euro");
       nomes.add("Devolver dinero");
       while (i==true){ // bucle repetitivo para que sempre se execute o software
        int opcion=JOptionPane.showOptionDialog(null,"Cafes Castelao","selección de bebida",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,nomes.toArray(),null); // creamos los botones
       
       // no se puede usar un switch case porque no se tiene una constante en cada caso , dado que al obtener las bebidas de un fichero el numero de botones puede variar , no teniendo cada opcion una posicion fija
       //SOLO SE PUEDE HACER CON IF ELSE
     
       if(opcion<tamaño){ // se a opcion e unha das pertencentes aos productos
           Productos bebida=LerDatos.seleccionarObxeto(nomes.get(opcion)); // seleccionamos a bebida a elaborar
         if(Monedero.credito<bebida.getPrecio()){ // se o credito non e suficiente 
             Display.mostrarPrecio(bebida);} //mostramos o precio da bebida 
         else // se o credito e suficiente
         {
             Display.elaborar(); // elaboramos a bebida
            Monedero.cambio=Monedero.credito-bebida.getPrecio(); //metemos en cambio o resto do prezo menos o credito
             Monedero.credito=0; // credito queda a cero
             Display.mostrarCambio(); // devolvemos cambio
             Monedero.cambio=0;// e volvemos a por o cambio a cero 
         } // cerramos else
       } // cerramos if 
       else if(opcion==tamaño){ // se a opcion marcada e a correspondete ao numero de productos, e decir a primeira que non e un producto, que e aumentar azucar
           Azucar.cantidad=Azucar.cantidad+1; // aumentamos en un a dosis de azucar
           Display.mostrarAzucar(); // e o mostramos en pantalla 
       } // cerramos else if
       else if(opcion==tamaño+1){ // se se trata da seguinte opcion, diminuir azucar
           Azucar.cantidad=Azucar.cantidad-1; // diminuimos a cantidade de azucar 
               Display.mostrarAzucar(); // mostramos a cantidade de azucar
       }// cerramos else if
       else if(opcion==tamaño+2){ // se e a penultima opcion, meter diñeiro
           Monedero.credito=Monedero.credito+1; // subimos un euro ao noso credito 
           Display.mostrarCredito(); // e mostramos o credito dispoñible
       }// cerramos else if
       else if(opcion==tamaño+3){ // no caso de que a opcion sexa a ultima, devolver o diñeiro
           Monedero.credito=0; // devolvemos o diñeiro
           Display.devolverCredito(); // mostramos un mensaxe por pantalla 
           
       }// cerramos else if
       else System.out.println("opción non valida"); // en caso de que non se de ninguna opcion das anteriores mostramos que a opcion non e valida
       } // cerramos else
       }// cerramos metodo 
    }// cerramos clase 
        
        
        
    
    

