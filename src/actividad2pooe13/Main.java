
package actividad2pooe13;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Definimos variables
        double VALCOMP, VALPAG, PDES; //Valor de la compra Valor a pagar Porcentaje de descuento
        String COLOR; //Color de la bolita
        
        
        //Título y datos
        System.out.println("Ejercicio resuelto #13");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario  los datos de valor de la compra y color de la bolita
        System.out.print("Ingrese el valor de la compra: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada1 = scanner.nextLine();
        VALCOMP = Integer.parseInt(entrada1);
        
        System.out.print("Ingrese el color de la bolita (EN MAYÚSCULAS): ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada2 = scanner.nextLine();
        COLOR = entrada2;
        
        
        //Toma de decisiones. Para determinar si una entrada corresponde a un colo utilizamo "entrada_a_coincidir".equals(entrada2)
        if ("BLANCO".equals(COLOR)) {
            PDES = 0;
        }
        else if ("VERDE".equals(COLOR)) {
            PDES = 10;
        }
        else if ("AMARILLO".equals(COLOR)) {
            PDES = 25;
        }
        else if ("AZUL".equals(COLOR)) {
            PDES = 50;
        }
        else {
            PDES = 100;
        }
        
        VALPAG = VALCOMP - (PDES * VALCOMP / 100);
        
        //Escribimos el valor que debe pagar el cliente
        System.out.println("El cliente debe pagar: $" + VALPAG);
    }
    
}
