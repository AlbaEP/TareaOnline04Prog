/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 * @version 1
 * @author Alba Estepa Pérez
 */
public class ValidarCadenas {

    /*EJERCICIOS CON EXPRESIONES REGULARES
    1.Crea una clase llamada "ValidarCadenas". Esta clase contendrá dos métodos estáticos 
    que se encargaran de validar una cadena de caracteres. A dichos métodos se le ha de pasar por parámetro 
    el dato a validar y devolverá verdadero (o True) si dicho dato cumple con la expresión regular. Los métodos son:
    1.1.comprobarMatriculaAutomovil: crear un método que compruebe si una matrícula de un vehículo es válida (solo vamos a tener en cuenta las matrículas actuales).
        1.1.1.Se considera como matrícula válida aquella que tiene 4 números seguida de 3 letras. Ejemplo: 4231BBC
        1.1.2.La matrícula no puede contener vocales ni la ñ.*/
    public static boolean comprobarMatriculaAutomovil(String matricula) {

        boolean resultado = true;
        int cuentaNumero = 0;

        for (int x = 0; x < matricula.length(); x++) {

            if (x <= 3) {

                if (Character.isDigit(matricula.charAt(x))) {
                    //System.out.println(" x< 4 El caracter es un dígito");

                } else {
                    // System.out.println(" x< 4 El caracter NO es un dígito");
                    resultado = false;
                }

            } else {

                if (Character.isDigit(matricula.charAt(x))) {
                    //System.out.println("El caracter es un dígito");
                    resultado = false;
                } else {
                    // System.out.println("El caracter NO es un dígito");

                    //es letra compruebo ñ o vocal
                    if (matricula.contains("ñ") || matricula.contains("Ñ")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }

                    if (matricula.contains("A") || matricula.contains("a")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }
                    if (matricula.contains("E") || matricula.contains("e")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }
                    if (matricula.contains("I") || matricula.contains("i")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }
                    if (matricula.contains("O") || matricula.contains("o")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }
                    if (matricula.contains("U") || matricula.contains("u")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }

                }

            }

        }
        return resultado;
    }

    /*2.1.comprobarMatriculaCiclomotor: crear un método que compruebe si una matrícula de un ciclomotor es válida (solo vamos a tener en cuenta las matrículas actuales).
        2.1.1.Se considera como matrícula válida aquella que tiene 1 letra seguida de 4 números y, posteriormente, 3 letras más. Ejemplo C8731BTJ
        2.1.2.La matrícula no puede contener vocales ni la ñ.
     */
    public static boolean comprobarMatriculaCiclomotor(String matricula) {

        boolean resultado = true;

        for (int x = 0; x < matricula.length(); x++) {

            if (x == 0) {
                //comprobar 1 letra 
                if (Character.isDigit(matricula.charAt(x))) {
                    //System.out.println(" x< 4 El caracter es un dígito");
                    resultado = false;
                } else {
                    // System.out.println(" x< 4 El caracter NO es un dígito");

                    //es letra compruebo ñ o vocal
                    if (matricula.contains("ñ")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }

                }

            } else if (x > 0 && x <= 4) {
                //comprobar 4 numero mas
                if (Character.isDigit(matricula.charAt(x))) {
                    //System.out.println(" x< 4 El caracter es un dígito");

                } else {
                    // System.out.println(" x< 4 El caracter NO es un dígito");
                    resultado = false;
                }
            } else {
                //3 letras más.
                if (Character.isDigit(matricula.charAt(x))) {
                    //System.out.println(" x< 4 El caracter es un dígito");
                    resultado = false;
                } else {
                    // System.out.println(" x< 4 El caracter NO es un dígito");

                    //es letra compruebo ñ o vocal
                    if (matricula.contains("ñ") || matricula.contains("Ñ")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }

                    if (matricula.contains("A") || matricula.contains("a")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }
                    if (matricula.contains("E") || matricula.contains("e")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }
                    if (matricula.contains("I") || matricula.contains("i")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }
                    if (matricula.contains("O") || matricula.contains("o")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }
                    if (matricula.contains("U") || matricula.contains("u")) {
                        //ERROR NO PUEDE CONTENER Ñ 
                        resultado = false;
                    }

                }
            }
        }

        return resultado;

    }

}
