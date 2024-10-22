import java.util.Scanner;
import java.util.Arrays;


public class EjercicioFunYBucle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
        int[] stocks = {3, 10, 2, 6, 4};

        generarReporteStock(productos, stocks);
    }

    public static void generarReporteStock(String[] productos, int[] stocks) {
        System.out.println("Productos con bajo stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " - Unidades: " + stocks[i]);
            }
        }



    }

}
