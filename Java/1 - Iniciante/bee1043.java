import java.util.Scanner;

public class bee1043 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double a,b,c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        if(a >= (b+c) || b >= (a+c) || c >= (a+b)){
            System.out.printf("Area = %.1f\n", (((b+a)*c)/2));
        }else{
            System.out.printf("Perimetro = %.1f\n",((a+b+c)));
        }
    }
}
