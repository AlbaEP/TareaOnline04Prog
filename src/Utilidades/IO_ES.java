
package Utilidades;

import java.util.Scanner;

/**
 *
 * @author Alba Estepa Pérez
 */
public class IO_ES {

    public static int leerInterger() {

        int dato = 0;
        
        System.out.println("Introducir un dato: ");
            Scanner teclado = new Scanner(System.in);
        try {
            dato = teclado.nextInt();
            
        } catch (Exception e) {
            System.out.println("ERROR: Valor no correcto.");
        }
        return dato;

    }

    public static float leerReal() {
        float dato2 = 0;
        try {
            System.out.println("Introducir un dato: ");
            Scanner teclado = new Scanner(System.in);
            dato2 = teclado.nextFloat();
        } catch (Exception e) {

            System.out.println("ERROR: Valor no correcto.");
        }

        return dato2;

    }

    public static long leerIntegerLargo() {
        long dato3 = 0;
        try {
            System.out.println("Introducir un dato: ");
            Scanner teclado = new Scanner(System.in);
            dato3 = teclado.nextLong();
        } catch (Exception e) {

            System.out.println("ERROR: Valor no correcto.");
        }

        return dato3;

    }

    public static double leerRealLargo() {
        double dato4 = 0;
        try {
            System.out.println("Introducir un dato: ");
            Scanner teclado = new Scanner(System.in);
            dato4 = teclado.nextDouble();
        } catch (Exception e) {

            System.out.println("Error: Valor no correcto.");
        }

        return dato4;
    }

    public static String escribir() {
        String dato5 = "";
        try {
            System.out.print("Introducir un dato: ");
            Scanner teclado = new Scanner(System.in);
            dato5 = teclado.nextLine();
        } catch (Exception e) {

            System.out.print("ERROR: Valor no correcto.");
        }

        return dato5;
    }

    public static String escribirLN() {
        String dato6 = "";
        try {
            System.out.println("Introducir un dato: ");
            Scanner teclado = new Scanner(System.in);
            dato6 = teclado.nextLine();
        } catch (Exception e) {

            System.out.println("ERROR: Valor no correcto.");
        }

        return dato6;

    }
}
