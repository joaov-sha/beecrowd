import java.util.Scanner;

public class bee1045 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        double a,b,c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        if(b > a && a > c){
            double temp = a;
            a = b;
            b = temp;
        }else if(c > b && b > a){
            double temp = c;
            c = a;
            a = temp;
        }
        if(a >= (b+c) || b >= (a+c) || c >= (a+b)){
            System.out.println("NAO FORMA TRIANGULO");
        }else if(Math.pow(a,2) == (Math.pow(b,2) + Math.pow(c,2)) || Math.pow(b,2) == (Math.pow(a,2) + Math.pow(c,2)) || Math.pow(c,2) == (Math.pow(a,2) + Math.pow(b,2))){
            System.out.println("TRIANGULO RETANGULO");
        }else if(Math.pow(a,2) > (Math.pow(b,2) + Math.pow(c,2)) || Math.pow(b,2) > (Math.pow(a,2) + Math.pow(c,2)) || Math.pow(c,2) > (Math.pow(a,2) + Math.pow(b,2))){
            System.out.println("TRIANGULO OBTUSANGULO");
            if(a == b && a != c || a == c && a != b){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }else if(Math.pow(a,2) < (Math.pow(b,2) + Math.pow(c,2)) || Math.pow(b,2) < (Math.pow(a,2) + Math.pow(c,2)) || Math.pow(c,2) < (Math.pow(a,2) + Math.pow(b,2))){
            System.out.println("TRIANGULO ACUTANGULO");
            if(a == b && a != c || a == c && a != b || b == c && b != a){
                System.out.println("TRIANGULO ISOSCELES");
            }else if(a == b && a == c){
                System.out.println("TRIANGULO EQUILATERO");
            }
        }
    }
}
