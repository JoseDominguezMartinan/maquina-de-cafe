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
 *
 * @author jdominguezmartinan
 */
public class LerDatos
{
  public static ArrayList<String> listaProductos(){ // listado de productos disponible, que estan escritos en nuestro fichero 
      Scanner sc;
      String linea;
      String[] lista = new String[2];
      ArrayList<String>nomes=new ArrayList();
      try{
          sc=new Scanner(new File("/home/local/DANIELCASTELAO/jdominguezmartinan/NetBeansProjects/MaquinaCafe/productos.txt"));
          while (sc.hasNextLine())
            {
                linea = sc.nextLine();
                lista = linea.split(",");
                nomes.add(lista[0]);

            }
      } catch(FileNotFoundException ex)
      {
         System.out.println("error lectura de arquivo");
      }
      return nomes;
  }
    
   

    public  static Productos seleccionarObxeto(String nome)
    {
        Scanner sc;
        String linea;
        String[] lista = new String[2];
        Productos pro=null;
        try
        {
            sc = new Scanner(new File("/home/local/DANIELCASTELAO/jdominguezmartinan/NetBeansProjects/MaquinaCafe/productos.txt"));
            while (sc.hasNextLine())
            {
                linea = sc.nextLine();
                lista = linea.split(",");
                if(lista[0]==nome)
                pro = new Productos(lista[0],Integer.parseInt(lista[1]));

            }
        } catch(FileNotFoundException ex)
        {
            System.out.println("error lectura de arquivo");
        }
        return pro;
    }

}
