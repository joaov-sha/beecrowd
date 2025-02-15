package Java.Beginner;

import java.util.Scanner;
public class Bee1010{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int codPUm, quantPUm, codPDois, quantPDois;
        double vPUm, vPDois;
        codPUm = s.nextInt();
        quantPUm = s.nextInt();
        vPUm = s.nextDouble();
        codPDois = s.nextInt();
        quantPDois = s.nextInt();
        vPDois = s.nextDouble();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (quantPUm*vPUm+quantPDois*vPDois));
        s.close();
    }
}