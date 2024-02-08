
package variables;
import java.util.Scanner;

public class Variables {


    public static void main(String[] args) {
        
        System.out.println("Tipos de variables: ");
        int numero = 1;
        String nombre = "flo";
        char letra = 'r';
        double temperatura = 38.5;
        boolean SiONo = false;
        long largo = 1255554256;
        
        System.out.println(numero + ", " + nombre + letra + ", " + temperatura + ", " + SiONo + ", " + largo);
        System.out.println("----------------------");
        System.out.println("Operadores logicos: ");
        int num1, num2, suma, resta, mult, div;
        num1 = 4;
        num2 = 2;
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + mult);
        System.out.println("El resultado de la division es: " + div);
        
        
        System.out.println("----------------------");
        System.out.println("Ejercicio 1: ");
        /**Ejercicio 1: Realizar un programa que permita el intercambio de valores entre dos variables
         por ejemplo: si la primer var vale 35 y la segunda 20, realizar lo necesario para que la var 1 
         valga 20 y la var 2 valga 35; mostrar los cambios de resultado en pantalla.*/
        
        int var1 = 35;
        int var2 = 20;
        int aux;
        
        System.out.println("-----antes-----");
        System.out.println("El valor del primer numero es: " + var1);
        System.out.println("El valor del segundo numero es: " + var2);
        
        aux = var2;
        var2 = var1;
        var1 = aux;
        
        System.out.println("-----despues-----");
        System.out.println("El valor del primer numero es: " + var1);
        System.out.println("El valor del segundo numero es: " + var2);
        
        
        System.out.println("----------------------");
        System.out.println("Ejercicio 2: Sentencia IF");
        /**Ejercicio 2: si num 1 es mayor a num 2, si el 2 es mayor mostrarlo en pantalla*/
        int n1 = 5;
        int n2 = 15;
        System.out.println("El primer numero es: "+ n1 + ". El segundo numero es: " + n2 + ".");
        
        if (n2 > n1) {
            System.out.println("El segundo numero es mayor al primer numero.");
        } else {
            System.out.println("El primer numero es mayor al segundo numero.");
        }
        
        
        System.out.println("----------------------");
        System.out.println("Ejercicio 3: Condicionales anidados IF|ELSE + IF|ELSE");
        /**Ejercicio 2: hacer lo mismo y validar que no sea igual*/
        
        int n3=15;
        int n4=25;
        System.out.println("El primer numero es: "+ n3 + ". El segundo numero es: " + n4 + ".");
        
        if (n4 > n3) {
            System.out.println("El segundo numero es mayor al primer numero.");
        } else {
            if (n4 == n3) {
                System.out.println("Los numeros son iguales");
            } else {
                System.out.println("El primer numero es mayor al segundo numero.");
            }
        }
        
        System.out.println("----------------------");
        System.out.println("Ejercicio 3: SWITCH");
        /*Ejercicio de selecion de dias de la semana*/
        int dia = 5;
        String nombreDia;
        
        switch (dia) {
            case 1: nombreDia = "Lunes.";
            break;
            case 2: nombreDia = "Martes.";
            break;
            case 3: nombreDia = "Miercoles.";
            break;
            case 4: nombreDia = "Jueves.";
            break;
            case 5: nombreDia = "Viernes.";
            break;
            case 6: nombreDia = "Sabado.";
            break;
            case 7: nombreDia = "Domingo.";
            break;
            default: nombreDia = "Numero de dia invalido.";
            break;        
        }
        System.out.println("El dia de la semana seleccionado es: " + nombreDia);
        
        
        System.out.println("----------------------");
        System.out.println("EJERCICIO INTEGRADOR");
        
        /*Una pequena despensa desea calcular los sueldos de sus empleados. Los puestos
        de los mismos pueden tener 3 categorias: 1-repositor, 2-cajero, 3-supervisor.
        -los repositores cobran $15.890 + un bono del 10%
        -los cajeros cobran $25.630,89 fijos
        -los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilacion
        Se necesita un programa que, dependiendo del tipo de empleado del que se trate
        calcule y muestre en pantalla el correspondiente sueldo*/
        
        double sueldo = 0;
        int categoria;
        
        System.out.println("Por favor, ingrese una categoria: ");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if (categoria == 1) {
            sueldo = 15890 + (15890*0.10);
        } else {
            if (categoria == 2) {
                sueldo = 25630.89;
            } else {
                if (categoria == 3) {
                    sueldo = 35560.20 - (35560.20 * 0.11);
                } else {
                    System.out.println("Debe ingresar un numero de categoria valido.");
                }
            }
        }
        
        if (categoria == 1 || categoria == 2 || categoria == 3) {
        System.out.println("El total del sueldo para la categoria seleccionada " + categoria + " es igual a " + sueldo);        
        }
        
        System.out.println("----------------------");
        System.out.println("Ejercicio 4: Operador ternario");
        /*Ejercicio: dependiendo de la calificacion del alumno, este obtiene o no el certificado*/
        
        double promedio;
        String condicionFinal;
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el promedio del alumno: ");
        promedio = tec.nextDouble();
        
        condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
        
        System.out.println("La condicion final del alumno es: " + condicionFinal);
        
        System.out.println("----------------------");
        System.out.println("Ejercicio 5: While");
        
        /*Ejercicio: mientras el contador sea menor a 10, mostrar un mensaje en pantalla*/
        
        int contador = 1;
        
        while (contador <= 10) {
            System.out.println("Estamos dando vuelta con WHILE, en la vuelta: " + contador);
            contador = contador + 1; 
        }

        System.out.println("----------------------");
        System.out.println("Ejercicio 6: For"); 
        /*Ejercicio: mismo que el anterior*/
        
        for (int cont = 0; cont <= 10; cont++) {
            System.out.println("Estamos dando vuelta con FOR, en la vuelta: " + cont);
        }
        
    }
    
}
