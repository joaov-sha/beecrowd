import java.util.Scanner;

public class bee1009 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        String nome = s.nextLine();
        System.out.printf("TOTAL = R$ %.2f\n",(s.nextDouble() + 0.15 * s.nextDouble()));
    }
}
