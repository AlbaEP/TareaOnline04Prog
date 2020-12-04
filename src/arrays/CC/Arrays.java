/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.CC;

import java.util.Scanner;

/**
 *
 * @author Alba Estepa Pérez
 */
public class Arrays {
    //EJERCICIOS DE ARRAYS
    /*Crea una clase llamada Arrays. En ella debes de tener tantos métodos como ejercicios se plantean a 
    continuación y un método opcionesMenu.
    1.En el método opcionesMenu crea un menú que nos permita ejecutar un ejercicio u otro. 
    Hay que tener en cuenta que solo se debe salir del programa si se pulsa el 0.
    */
    public static void opcionesMenu (){
    
        int numero_menu = 1;
        
        while (numero_menu != 0){
            
        System.out.println("---MENÚ---");
        System.out.println("0. Para salir del menú. "
                           +"\n1.Opcion 1."
                           +"\n2.");
            System.out.println("Seleccione una opción: ");
            
            Scanner teclado = new Scanner (System.in);
            
            numero_menu = teclado.nextInt();
            
            switch (numero_menu){
            
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                default :
                    
                    
            
            
            
            }
    
        
    }
    
}
/*2.Crea un array con 10 posiciones y rellenalo con números aleatorios, entre 1 y 20, usando el método random
de la clase Math. Posteriormente tiene que pedir al usuario que introduzca un número. Hasta que el número introducido no coincida con uno de los almacenados 
en el array no debe finalizar el método, y antes de salir debe indicar en qué posición del array estaba almacenado.
*/
    
 public static void crearArray() {
	 
	 int[] array = new int[10];
	 
	 
	 for(int x=0;x<array.length;x++) {
		 
		 //número generado estará entre 1 y 20, por que primero lo multiplicamos por 20 con lo que tendríamos un número entre 0 y 19 y al sumarle 1 a este número tendremos finalmente un número entre 1 y 20.
		 array[x] = (int)(Math.random()*20+1);
		 System.out.println("Numeros del array: "+array[x]);
		 System.out.println("");
	 }
	 System.out.println("Escriba numeros asta que coindida con el del array");
	 System.out.println("");
	 Scanner leer=new Scanner(System.in);
	 
	
	 int numeroLeido=0;
	 int y = 0; //PARA ACCEDER A LAS DIFERENTES POSICIONES DEL ARRAY
	 
	 while(numeroLeido >= 0) {
		
		 
		 numeroLeido = leer.nextInt();
		 
		 for(int x = 0; x<array.length;x++) {
			
			 if(numeroLeido == array[x]) {
				 System.out.println("EL NUMERO INTRODUCIDO EXISTE EN EL ARRAY");
				 x = x+1; //POR QUE EMPIEZA EN 0 
				 System.out.println("EN LA POSICION : "+x); //sumamos 1 a y por que empieza por EL 0
				 numeroLeido = -1; //PARA SALIR DEL WHILE POR QUE YA EXISTE EL NUMERO
			 }
		 }
		
		 //SI NO EXISTE VOLVEMOS A PEDIR EL NUMERO
	 }
	 
 }   
    
    
/*3.Método que nos pida por teclado el tamaño de un Array de números decimales y posteriormente lo recorra introduciendo valores aleatorios mediante el uso del método random de la clase Math. 
Obtener la media de todos los números introducidos, el número más alto y el más bajo que hay en el array.*/
 public static void mediaNumeros() {
	 
	 System.out.println("Escriba el tamaño del array: ");
	 Scanner leer=new Scanner(System.in);
	 
	 int tamano =leer.nextInt();
	 
	 double[] array=new double[tamano];
	 
	 double sumaDelosValores=0;
	 int numeroMasBajo=0;
	 int numeroMasAlto=0;
	 
	 for(int x=0;x<array.length;x++) {
		 
		 array[x] = (int)(Math.random()*100);
		 
		 System.out.println("Valor añadido al array: "+array[x]);
		 
		//VOY SUMANDO LOS VALORES PARA OBTENER LUEGO LA MEDIA
		 sumaDelosValores = sumaDelosValores + array[x];
		 
		 //MIRO EL MENOR NUMERO
		 if(numeroMasBajo > array[x]) {
			 numeroMasBajo = (int) array[x]; //
		 }
		 
		 if(numeroMasAlto < array[x]) {
			 numeroMasAlto = (int) array[x]; //
		 }
		 
	 }
	 
	 double media = sumaDelosValores / tamano ; //DIVIDO ENTRE TAMANO POR QUE ME DICE CUANTOS VALORES HAY EN EL ARRAY
	 
	 System.out.println("La media es: "+media);
	 System.out.println("El numero mas alto es : "+numeroMasAlto);
	 System.out.println("El numero mas bajo es : "+numeroMasBajo);
	 
	
 }
 /*4.Método que nos pida por teclado el tamaño de un Array de enteros y posteriormente lo recorra introduciendo valores aleatorios mediante el 
 uso del método random de la clase Math. Los números han de estar comprendidos entre 0 y 100. Una vez que el array está lleno de números debe de recorrerlo nuevamente, 
 mostrar el contenido del mismo e indicar cuantos números son mayores que 50 y cuantos menores.
  */
 public static void NumerosMayorMenor() {
	 
	
	 System.out.println("Escriba el tamaño del array: ");
	 Scanner leer=new Scanner(System.in);
	 
	 int tamano =leer.nextInt();
	 
	 double[] array=new double[tamano];
	 
	 for(int x=0;x<array.length;x++) {
		 
		 array[x] = (int)(Math.random()*100);
		
		 
	 }
	 
	 
	// Una vez que el array está lleno de números debe de recorrerlo nuevamente, 
       // mostrar el contenido del mismo e indicar cuantos números son mayores que 50 y cuantos menores.
			 
	 
		 int cuentaMayorCincuenta=0;
		 int cuentaMenorCincuenta=0;
		 
		 for(int x=0;x<array.length;x++) {
			 
			 System.out.println("El contenido del array es: "+array[x]);
			 
			 if(array[x] > 50) {
				 //VOY CONTANDO 
				 cuentaMayorCincuenta++;
			 }else {
				 //ES MENOR QUE 50
				 cuentaMenorCincuenta++;
			 }
			 
		 }
		 
		 System.out.println("La cantidad de numeros mayores que 50 son: "+cuentaMayorCincuenta);
		 System.out.println("La cantidad de numeros menores que 50 son: "+cuentaMenorCincuenta);
	 
 }

}
