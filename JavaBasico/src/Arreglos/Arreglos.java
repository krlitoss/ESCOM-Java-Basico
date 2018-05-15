/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author Carlos
 */
public class Arreglos {

    public static void main(String[] args) {
        
/* DECLARACION DE UN ARRAY #1
 * Tipo_de_dato[ ] Nombre_del_array = {aqui se ponen los datos que va a contener el array}
 * ejemplo:
 */
       
        int [] arregloEntero  = {1,2,3,4,5,6,7,8,9,99}; // recomendable esta opcion
        int arregloEntero2 [] = {1,2,3,4,5,6,7,8,9,99}; 

/* DECLARACION DE UN ARRAY #2
 * Tipo_de_dato[ ] Nombre_del_array = new Tipo_de_dato [tamaño del array]
 * En este tipo de array se decalara y se crea al mismo tiempo
 * ejemplo:
 */        
        
       int[] arregloEntero3 =new int[4]; 
        arregloEntero3[0]=2;
        arregloEntero3[1]=4;
	arregloEntero3[2]=15;
	arregloEntero3[3]=25;
        
        
        
        
        
        
        
        
       int[] [] arregloEntero4 =new int[11] [11];
       int n = 1; 
   
    
        for (int i=0; i<10; i++)
        {
        for (int j=0; j<10; j++)
        {   
        arregloEntero4 [i][j] = n;
        n++;
        
//            System.out.println(i+ " "+j);
        }
        }
        
        for (int i=0; i<10; i++)
        {
        for (int j=0; j<10; j++)
        {   
        
        
           System.out.print("\t"+arregloEntero4  [i][j]);
            
        }System.out.println("");
        }
        
         
    
    
 
    
    } //psvm
    
    
    
    
    
    
    
} //class