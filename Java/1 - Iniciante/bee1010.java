import java.util.Scanner;

public class bee1010 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int numUm = s.nextInt();
        int quantUm = s.nextInt();
        double valUm = s.nextDouble();
        int numDois = s.nextInt();
        int quantDois = s.nextInt();
        double valDois = s.nextDouble();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",(valUm*quantUm + valDois*quantDois));
    }
}
