/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesretorno;

/**
 *
 * @author Jesus
 */
public class TestFunciones {
    public static MatematicasFunciones funciones=new MatematicasFunciones();
    public static void main(String[] args) {
        System.out.println("Suma es: "+MatematicasFunciones.suma(235, 455));
        System.out.println("Resta es: "+MatematicasFunciones.resta(235, 455));
        System.out.println("Multi es: "+MatematicasFunciones.multi(235, 455));
        System.out.println("Divi es: "+MatematicasFunciones.div(235, 455));
    }
}
