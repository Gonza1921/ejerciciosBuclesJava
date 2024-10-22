import java.util.Scanner;
import java.util.Arrays;


public class EjercicioBucle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] productos = {"banana","tomate","lechuga","papa","cebolla"};
        int [] stock = {10, 2, 15, 3 ,5};
        int i;

        System.out.println("Productos con bajo stock: ");
        for (i = 0; i < productos.length;i++){
            if (stock[i] < 5) {
                System.out.println("El producto: " + productos[i] + " ,tiene poco stock ");
            }
        }












    }

}
