/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Utilidades.ValidarCadenas;
import arrays.CC.Arrays;
import arrays.CC.CadenaCaracteres;
import java.util.Scanner;

/**
 *
 * @author Alba Estepa Pérez
 */
public class Principal {

    public static void main(String[] args) {
        //LLAMADA MÉTODOS CLASE CadenaCaracteres
        //  CadenaCaracteres objCadena = new CadenaCaracteres();
        //  objCadena.opcionesMenu();
        //   objCadena.buscarPalabra();
        //  objCadena.sustituirPalabra();
        // objCadena.mostrarFrase();

        //LLAMADA MÉTODOS CLASE ValidarCadenas
        //  boolean resultado =  ValidarCadenas.comprobarMatriculaAutomovil("1598LOP");
        // System.out.println("El resultado es : "+resultado);
        //boolean resultado = ValidarCadenas.comprobarMatriculaCiclomotor("A1598DEl");
        //System.out.println("Resultaod es: "+resultado);
        //Arrays.crearArray();
        //Arrays.mediaNumeros();
        //Arrays.NumerosMayorMenor();
        int numero_menu = 1;

        while (numero_menu != 0) {

            System.out.println("----MENÚ PRINCIPAL----");
            System.out.println("0. Para salir del menú. "
                    + "\n1.Submenú clase Arrays."
                    + "\n2.Submenú clase CadenaCaracteres."
                    + "\n3. Submenú clase HundirLaFlota.");
            System.out.println("Seleccione una opción: ");

            Scanner teclado = new Scanner(System.in);

            numero_menu = teclado.nextInt();

            switch (numero_menu) {

                case 1:

                    Arrays.opcionesMenu();

                    break;

                case 2:

                   

                    break;

                case 3:

                default:

            }

        }

    }
}
