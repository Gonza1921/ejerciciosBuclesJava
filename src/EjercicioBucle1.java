import java.util.Scanner;


public class EjercicioBucle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasDedicadas;
        int horasTotales = 0;
        String[] nombreActividaes = { "estudiar","hacer ejercicio","leer","tiempo libre" };
        int i = 0;
        int actividades = 4;

        while (i < actividades){
            System.out.println("Ingrese las horas dedicadas a " + nombreActividaes[i]+ ": ");
            horasDedicadas = sc.nextInt();
            horasTotales = horasTotales + horasDedicadas;
            i++;
        }

        System.out.println("Las tiempo total dedicado es:"+ horasTotales);






    }

}