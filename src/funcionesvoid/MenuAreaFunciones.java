/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesvoid;
import java.util.Scanner;
/**
 *
 * @author Jesus
 */
public class MenuAreaFunciones {//Inicia Clase
        public static MenuAreaFunciones apuntadorMetodo=new MenuAreaFunciones();
        public static Scanner Dato=new Scanner(System.in);
                public static int menu;
        //funcion area cuadrado
        public void areaCuadrado(){//Inicia funcion area
            //entrada
            System.out.println("Captura Lado: ");
            float lado=Dato.nextFloat();
            //proceso
            float areaCuadrado=lado*lado;
            //Salida
            System.out.println("El area es: "+areaCuadrado);
        }//Termina función area
        
        //Area Rectangulo
        public void areaRectangulo(){
            System.out.println("Captura base:");
            float base=Dato.nextFloat();
            System.out.println("Captura lado: ");
            float lado=Dato.nextFloat();
            float areRec=base*lado;
            System.out.println("Area Rectangulo: "+areRec);
        }
        public void menuAreas(){
                    do {            
                System.out.println("Menú Areas");
                System.out.println("1.- Area Cuadrado");
                System.out.println("2.- Area Rectangulo");
                System.out.println("3.- Salir");
                menu=Dato.nextInt();
                switch (menu) {
                case 1:
                    apuntadorMetodo.areaCuadrado();
                    break;
                case 2:
                    apuntadorMetodo.areaRectangulo();
                    break;
                default:
                    break;
            }
        } while (menu!=3);
        }
        
    public static void main(String[] args) {//Inicia main
        //1.- Realizar un objeto para llamar a la función por medio de la clase
        apuntadorMetodo.menuAreas();
    }
}
