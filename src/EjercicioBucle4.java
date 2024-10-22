import java.util.Scanner;


public class EjercicioBucle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String [] dia = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
       int ventaDia;
       int ventasTotal = 0;
       int i;

       for (i = 0; i < dia.length;i++){
           System.out.println("Ingrese la venta del dia: "+ dia[i]);
           ventaDia = sc.nextInt();
           System.out.println("La venta del dia "+ dia[i] + " fue de: " + ventaDia);
           ventasTotal += ventaDia;
       }
       System.out.println("Las ventas total de la semana fueron de: "+ ventasTotal);






    }

}