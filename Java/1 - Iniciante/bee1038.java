import java.util.Scanner;

public class bee1038 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){

        int cod, quantidade;

        cod = s.nextInt();
        quantidade = s.nextInt();

        if(cod == 1){
            System.out.printf("Total: R$ %.2f\n",(quantidade*4.00));
        }else if(cod == 2){
            System.out.printf("Total: R$ %.2f\n",(quantidade*4.50));
        }else if(cod == 3){
            System.out.printf("Total: R$ %.2f\n",(quantidade*5.00));
        }else if(cod == 4){
            System.out.printf("Total: R$ %.2f\n",(quantidade*2.00));
        }else if(cod == 5){
            System.out.printf("Total: R$ %.2f\n",(quantidade*1.50));
        }
    }
}
