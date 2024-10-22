import java.util.Scanner;
import java.util.Arrays;


public class EjercicioBucle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadEmpleados;
        int HorasTrabajadas;
        double tarifaHora = 15.0;
        double sueldo;
        int i = 1;

        System.out.println("Ingrese la cantidad de empleados: ");
        cantidadEmpleados = sc.nextInt();

        while (i <= cantidadEmpleados){

            System.out.println("Ingrese las horas trabajadas por el empleado " + i + ": ");
            HorasTrabajadas = sc.nextInt();
            sueldo = HorasTrabajadas * tarifaHora;
            System.out.println("El sueldo del empleado "+ i + "es: "+ sueldo);
            i++;

        }



    }

}