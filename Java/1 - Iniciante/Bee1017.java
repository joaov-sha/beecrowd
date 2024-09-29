import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double km = 12;
        int horas = s.nextInt();
        int vm = s.nextInt();
        System.out.printf("%.3f%n",(double)(horas*vm/km));
        s.close();
    }
}
