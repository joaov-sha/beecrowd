import java.util.Scanner;

public class bee1046 {
    
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        int inicio, termino, dia;
        inicio = s.nextInt();
        termino = s.nextInt();

        dia = 24;

        if(inicio == termino){
            System.out.println("O JOGO DUROU " + dia + " HORA(S)");
        }else if(inicio >= 12 && termino <= 12){
            System.out.println("O JOGO DUROU " + (dia -( -termino + inicio)) + " HORA(S)");
        }else if(inicio <= 12 && termino >= 12){
            System.out.println("O JOGO DUROU " + (termino - inicio) + " HORA(S)");
        }else if(inicio <= 12 && termino <= 12){
            System.out.println("O JOGO DUROU " + (termino - inicio) + " HORA(S)");
        }
    }
}
