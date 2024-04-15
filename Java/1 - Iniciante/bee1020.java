import java.util.Scanner;

public class bee1020 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int tempo = s.nextInt();
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",(tempo/365),((tempo%365)/30),((tempo%365)%30));
    }
}
