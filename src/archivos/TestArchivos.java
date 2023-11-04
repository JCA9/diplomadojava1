/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class TestArchivos {
    public static void main(String[] args) {
        int opcion;
        MetodosArchivos miArchivo=new MetodosArchivos();
        
        do {  //inicia do-while          
            System.out.println("Ingresa una opcion:");
            System.out.println("1.- Solicitar nombre de archivo");
            System.out.println("2.- Ingrese texto en el archivo");
            System.out.println("3.- Agregar más texto en el archivo");
            System.out.println("4.- Leer texto en el archivo");
            System.out.println("5.- Salir");
            Scanner Dato=new Scanner(System.in);
            opcion=Dato.nextInt();
            String ruta="D:\\Documents\\"+miArchivo.nom+".txt";
            switch (opcion) {
                case 1:miArchivo.nombreA(); break;
                case 2:miArchivo.texto(); break;
                case 3:miArchivo.texto(); 
                       miArchivo.escribir(ruta, miArchivo.linea); 
                       break;
                case 4:System.out.println(miArchivo.leer(ruta)); break;
                case 5:System.out.println("Finalizo Programa"); break;
                default:System.out.println("Opcion invalida");break;
            }
            
        } while (opcion<5); //termina do-while 
    }
}//Termina Clase
