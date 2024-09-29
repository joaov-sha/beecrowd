import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int horas, numero;
        numero = s.nextInt();
        horas = s.nextInt();
        double salario;
        salario = s.nextDouble();
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n",(salario*horas));
        s.close();
    }
}