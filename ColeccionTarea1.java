/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciontarea1;
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Collection listaVariacionIntensidadLuminosa=new ArrayList<String>();
        listaVariacionIntensidadLuminosa.add("tarjeta");
        listaVariacionIntensidadLuminosa.add("cautin");
        listaVariacionIntensidadLuminosa.add("estano");
        listaVariacionIntensidadLuminosa.add("simulador");
        listaVariacionIntensidadLuminosa.add("acido ferrico");
        listaVariacionIntensidadLuminosa.add("taladro");
        listaVariacionIntensidadLuminosa.add("interruptor");
        listaVariacionIntensidadLuminosa.add("capacitor");
        listaVariacionIntensidadLuminosa.add("diac");
        listaVariacionIntensidadLuminosa.add("triac");
        listaVariacionIntensidadLuminosa.add("resistencia 1000Khom");
        listaVariacionIntensidadLuminosa.add("potenciometro 250Khom");
        listaVariacionIntensidadLuminosa.add("boquilla1");
        listaVariacionIntensidadLuminosa.add("boquilla2");
        listaVariacionIntensidadLuminosa.add("Lampara incandescente1");
        listaVariacionIntensidadLuminosa.add("Lampara incandescente2");
        listaVariacionIntensidadLuminosa.add("Cables");
        listaVariacionIntensidadLuminosa.add("caja");
        listaVariacionIntensidadLuminosa.add("desarmador");
        listaVariacionIntensidadLuminosa.add("multimetro");


        System.out.println("---------UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE----------");
        System.out.println("NOMBRE:LENIN PAUL INACAZA SIMBA");
        System.out.println("MATERIA:ROGRAMACION");
        System.out.println("NRC:7450");
        System.out.println("DOCENTE:ING.LUIS GUERRA");
        System.out.println("Numero de Elementos empleados en el proyecto Variación Intensidad Luminosa: " + listaVariacionIntensidadLuminosa.size() );
        System.out.println("LOS MATERIALES UTILIZADOS EN EL PROYECTO VARIACION DE LA INTENSIDAD LUMINOSA SON : ");
        System.out.println(listaVariacionIntensidadLuminosa.toString());

        listaVariacionIntensidadLuminosa.remove("caja");
        listaVariacionIntensidadLuminosa.remove("desarmador");
        listaVariacionIntensidadLuminosa.remove("cautin");
        listaVariacionIntensidadLuminosa.remove("estano");
        listaVariacionIntensidadLuminosa.remove("tarjeta");
        listaVariacionIntensidadLuminosa.remove("simulador");
        listaVariacionIntensidadLuminosa.remove("acido ferrico");
        listaVariacionIntensidadLuminosa.remove("taladro");
        listaVariacionIntensidadLuminosa.remove("multimetro");

        System.out.println("NUMERO DE MATERIALES DESPUES DE SER ELIMINADOS caja,desarmador,cautin,estano,targeta,simulador,acido ferrico,taladro,multimetro"
                + " QUE SON ELEMENTOS SECUNDARIOS EN EL CIRCUITO : " +listaVariacionIntensidadLuminosa.size() );
        System.out.println("LOS MATERIALES PASIVOS QUE CONFORMAN EL CIRCUITO EN EL PROYECTO VARIACION DE LA INTENSIDAD LUMINOSA SON : ");
        System.out.println(listaVariacionIntensidadLuminosa.toString());














    }

}
