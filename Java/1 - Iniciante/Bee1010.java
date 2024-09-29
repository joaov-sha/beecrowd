import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p1, np1, p2, np2;
        double vp1, vp2;
        p1 = s.nextInt();
        np1 = s.nextInt();
        vp1 = s.nextDouble();
        p2 = s.nextInt();
        np2 = s.nextInt();
        vp2 = s.nextDouble();
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",((np1*vp1)+(np2*vp2)));
        s.close();
    }
}
