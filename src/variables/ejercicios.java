
package variables;

import java.util.Scanner;

public class ejercicios {


    public static void main(String[] args) {
        System.out.println("Ejecicio 1: ");
        /*Realizar un programa que dado por teclado un limite numerico por teclado (por ejemplo 100)
        muestre en pantalla todos los numeros hasta ese limite (empezando por 1)*/
        //tenemos un limite, pedirle al usuario que ingrese el limite
        
        System.out.println("Por favor, Ingrese el limite hasta el que quiera contar");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        
//        int contador = 1;
//        while (contador <= limite) {
//            System.out.println(contador);
//            contador = contador + 1;
//            otra opcion de contador es --->  contador = contador ++;
//        }
        
        for (int contador = 1; contador <= limite; contador++) {
            System.out.println(contador);
        }
        
        System.out.println("----------------------");
        System.out.println("Ejercicio 2: ");
        //Mostrar en pantalla las palabras ingresadas por teclados hasta que se escriba la palabra SALIR
        
        System.out.println("Ingrese una palabra: ");
        Scanner tec = new Scanner (System.in);
        String word = tec.next();
        String key = "salir";

        
        while (!word.equalsIgnoreCase(key)) {
        System.out.println(word);
        System.out.println("Ingrese una palabra: ");
        word = tec.next();
        }

        System.out.println("----------------------");
        System.out.println("Ejercicio 3: ");
        /*En la ciudad de Obera, Misiones se realiza año a año la "Maraton del inmigrante" en el marco de la fiesta
        Nacional del inmigrante.El evento cuenta con un dia de inscripciones que puede llegar a haber. Desde la
        Federacion de Colectividades (Organimo organizativo) manifestaron que se solicitan los siguientes datos para
        la inscripcion de cada participante: dni, nombre y edad.
        En cuanto a las categorias posibles para una inscripcion se manejan las siguientes:
        -Menores A (6 a 10 años) -Menores B (11 a 17 años) -Juveniles (18 a 30 años)-Adultos (31 a 50 años)-Adultos Mayores (mas de 50 años)
        Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por
        pantalla a que categoria debe ser inscripto. Cabe destacar que, al finalizar el dia, para dar fin a las 
        inscripciones, se debe ingresar un dni con valor 0 y un nombre con la palabra fin*/
        
        System.out.println("Ingrese el dni de la persona");
        Scanner tecl = new Scanner (System.in);
        String dni = tecl.nextLine();
        
        System.out.println("Ingrese el nombre de la persona");
        String nombre = tecl.nextLine();
        
        System.out.println("Ingrese la edad de la persona");
        Scanner tecl2 = new Scanner (System.in);
        int edad = tecl2.nextInt();

        
        while (!nombre.equalsIgnoreCase("fin") && !dni.equals("0") ) {
            if (edad>=6 && edad <=10) {
                System.out.println("La categoria es Menores A");
            } else {
                if (edad>=11 && edad<=17) {
                    System.out.println("La categoria es Menores B");
                } else {
                    if (edad>=18 && edad<=30) {
                        System.out.println("La categoria es Juveniles");
                    } else {
                        if (edad>=31 && edad<=50) {
                            System.out.println("La categoria es Adultos");
                        } else {
                            if (edad>=51) {
                                System.out.println("La categoria es Adultos Mayores");
                            } else {
                                System.out.println("La persona no tiene la edad indicada");
                            }
                        }
                    }
                }
            }
        
            System.out.println("Ingrese el dni de la persona");
            dni = tecl.nextLine();
            System.out.println("Ingrese el nombre de la persona");
            nombre = tecl.nextLine();
            System.out.println("Ingrese la edad de la persona");
            edad = tecl2.nextInt();    
        }
    }
    
}
