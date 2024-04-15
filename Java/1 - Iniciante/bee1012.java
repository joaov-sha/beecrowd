import java.util.Scanner;

public class bee1012 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double a,b,c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",((a*c)/2),(3.14159 * Math.pow(c,2)), (((a+b)*c)/2), (Math.pow(b,2)), (a*b));
    }
}
