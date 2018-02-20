/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import maquinacafe.Productos;

/**
 *esta clase esta creada para acceder aos datos dun ficheiro onde temos almacenados os productos que temos a venta na nosa maquina
 * @author jdominguezmartinan
 * @version 1.0
 */
public class LerDatos
{
    /**
     * metodo creado para visualizar o nome dos productos a venta
     * @return nomes lista de nombres de los productos a la venta 
     */
  public static ArrayList<String> listaProductos(){ 
   
      Scanner sc; // declaramos un obxeto de tipo escaner para poder traballar co ficheiro
      String linea; // en linea almacenaremos a informacion de cada unha das lineas
      String[] lista = new String[2]; // utilizamos un array de dous elementos para separar os nomes dos precios da informacion almacenada en linea
      ArrayList<String>nomes=new ArrayList(); // arraylist de nomes con todos os nomnes dos productos 
      try{ // ao traballar con ficheiros temos que contemplar a excepcion de non atoparse o ficheiro
          sc=new Scanner(new File("productos.txt"));
          while (sc.hasNextLine()) // recorremos o ficheiro co scanner que declaramos 
            {
                linea = sc.nextLine(); // insertamos a informacion en linea
                lista = linea.split(","); // separamos nome e precio 
                nomes.add(lista[0]); // engadimos o nome ao array de nomes

            } // cerramos o bucle 
      } catch(FileNotFoundException ex) // cerramos try e abrimos catch
      {//abtimos catch
         System.out.println("error lectura de arquivo"); // en caso de non atopar o arquivo mostramos un mensaxe en pantalla
      }//cerramos catch
      return nomes; // devolvemos a lista de nomes do producto
  }//cerramos metodo
    /**
     * metodo que, segundo o nome de producto que escollera o usuario, selecciona o producto do ficheiro 
     * @param nome nome do producto que o usuario escolleu
     * @return pro obxeto de tipo producto, producto que o usuario escolleu
     */
   
    public  static Productos seleccionarObxeto(String nome)
    {
        Scanner sc; // obxeto de tipo scanner para poder traballar co ficheiro
        String linea; // para almacenar a linea do ficheiro
        String[] lista = new String[2]; // array de dous elementos cos dous atributos da clase productos
        Productos pro=null; // // obxeto de tipo producto co que vamos a devolver a seleccion do cliente, para poder devolvelo temos que inicializalo
        try // ao traballar co ficheiro temos que tratar a excepcion de documento non atopado
        { // abrimos try
          
            sc = new Scanner(new File("productos.txt"));
            while (sc.hasNextLine()) // co obxeto de tipo escaner recorremos o ficheiro
            { // abrimos bucle
               
                linea = sc.nextLine(); // insertamos a linea en linea
                lista = linea.split(","); // separamos o nome do prezo que no arquivo veñen separados co separador ","
                if(lista[0].equals(nome)) // se o nome coincide co nome que pasou o usuario
               pro = new Productos(lista[0],Integer.parseInt(lista[1])); // creamos un obxeto de ese producto co seu nome e prezo

            } // cerramos bucle
        } catch(FileNotFoundException ex) // tratamos a excepcion
        { // abrimos catch
            System.out.println("error lectura de arquivo"); // mostramos mensaxe por pantalla no caso de non atopar o arquivo
        } // cerramos catch
        return pro;
    }

}
