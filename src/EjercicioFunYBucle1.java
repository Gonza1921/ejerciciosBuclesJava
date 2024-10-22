import java.util.Scanner;
import java.util.Arrays;


public class EjercicioFunYBucle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ventasDia = new int[30];
        int calcularIngresosMensuales;
        int i = 0;
        int ventasTotal = 0;

        for (i = 1; i <= 10;){
            System.out.println("Ingrese la venta: "+ i );
            ventasDia[i]= sc.nextInt();
            ventasTotal = ventasDia[i] + ventasTotal;
            i++;

        }

        System.out.println("Las ventas totales del mes son: "+ ventasTotal);







    }

}