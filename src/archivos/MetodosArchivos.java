/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; //LIBRERIA DE SALIDA Y ENTRADA DE DATOS DE UN ACHIVO
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class MetodosArchivos {
    String nom;//Variable para nombre de archivo
    String linea;//Identificar lineas de escritura en el archivo

    //Funcion para solicitar el nombre del archivo
    public void nombreA(){
        System.out.println("Ingrese el nombre de archivo al generar");
        Scanner arje=new Scanner(System.in);
        nom=arje.next();
        System.out.println("El nombre del archivo es: "+nom+".txt");
        
    }//termina funcion para solicitar nombre del archivo
    
    //funcion para ingresar texto en el archivo
    public void texto(){
        System.out.println("Capture el texto que desea agregar a el archivo: ");
        Scanner arje=new Scanner(System.in);
        linea=arje.nextLine();
    }
    
    //funcion para escribir texto en el archivo
    public void escribir(String ruta, String cadena){
        File archivo=new File(ruta); //Se lee el archivo y ruta
        //Estructura de control para tratamiento de errores Try-catch trata de hacer
        try {//inicia try
            FileWriter escribirArchivo=new FileWriter(archivo,true);//Escribe el archivo
            BufferedWriter buffer=new BufferedWriter(escribirArchivo);//Lee el archivo
            buffer.write(cadena);//Escribe la linea que recibe
            buffer.newLine(); //Crea una nueva linea 
            buffer.close();//Cierra la funcion de escritura
        } catch (Exception e) {//inicia el catch
            System.out.println("Error en el archivo o codigo Verifica: "+e);
        }//termina el catch
    }
    //Funcion para leer el contenido del archivo
    public String leer(String ruta){
        //tipo de dato dinamico arrayList(almacena valores y los procesa)
        ArrayList array=new ArrayList();
        String linea="";
        String retornar ="";
        File archivo=new File(ruta); //leer la ruta y el archivo 
        try {
            FileReader leerArchivo=new FileReader(archivo);//Sentencia para leer el archivo
            BufferedReader buffer=new BufferedReader(leerArchivo);//para lectura de buffer
            while((linea = buffer.readLine())!=null){
                retornar += linea +"\n";
            }
            buffer.close();
        } catch (Exception e) {
            System.out.println("Error verifica instrucciones !!!");
        }
        
        return retornar;
    }
}
