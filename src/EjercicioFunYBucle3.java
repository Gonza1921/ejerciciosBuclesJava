import java.util.Scanner;
import java.util.Arrays;


public class EjercicioFunYBucle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] clientes = {"Juan","Pedro","Gonzalo","Camila","Roberto"};
        int [] facturasPendientes = {200,700,800,300,1050};


        enviarFacturas(clientes,facturasPendientes);

    }

      static void enviarFacturas (String [] clientes, int [] facturasPendientes) {
          int i;
          for (i = 0; i < clientes.length; i++){
              if (facturasPendientes[i] > 500){
                  System.out.println("Enviar factura al cliente "+ clientes[i]);
              }


        }

    }

}



