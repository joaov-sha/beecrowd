package Java.Beginner;

import java.util.Scanner;
public class Bee1010{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // Descrição: Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
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