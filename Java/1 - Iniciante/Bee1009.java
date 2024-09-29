import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        double salario = s.nextDouble();
        double vendas = s.nextDouble();
        System.out.printf("TOTAL = R$ %.2f%n",(salario+(0.15*vendas)));
        s.close();
    }
}
