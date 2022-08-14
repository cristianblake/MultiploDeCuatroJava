import java.util.Scanner;
/**
 *
 * @author Cristian Lopez
 */

public class MultiploDeCuatro {
    /**
     * @param args the command line argumentsD
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //My code
        System.out.print("Bienvenido\n");
        // Inicializando variable para guardar el numero a insertar
        int number;
        //Pidiendo numero
        System.out.print("Escriba un numero a evaluar: ");
        number = sc.nextInt();
        //Evaluando el numero con la condicion si es multiplo de 4
        if(number%4 == 0){
            //imprimiendo el mensaje de si es multiplo de 4
            System.out.print("Su numero " + number + " SI es multiplo de 4");
        }else{
            //imprimiendo el mensaje que no es multiplo de 4
            System.out.print("Su numero " + number + " NO es multiplo de 4");
        }
    }
}
