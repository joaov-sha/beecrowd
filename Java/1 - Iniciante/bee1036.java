import java.util.Scanner;

public class bee1036 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double a, b, c, delta, r1, r2;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        delta = Math.pow(b,2) - 4 * a * c;
        if(a == 0 || delta < 0 ){
            System.out.println("Impossivel calcular");
        }else{
            r1 = ((-b + Math.sqrt(delta))/(2*a));
            r2 = ((-b - Math.sqrt(delta))/(2*a));
            System.out.printf("R1 = %.5f\nR2 = %.5f\n",r1,r2);
        }
    }
}
