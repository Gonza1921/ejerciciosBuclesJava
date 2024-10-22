import java.util.Scanner;

public class EjercicioBucleAnidado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = sc.nextInt();

        for (int num = 0; num <= N; num++) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial de " + num + " es: " + factorial);
        }

    }
}