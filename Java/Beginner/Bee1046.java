package Java.Beginner;

import java.util.Scanner;
public class Bee1046 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int inicio, fim, dia, duracao;
        
        duracao = 0;
        dia = 24;
        inicio = s.nextInt();
        fim = s.nextInt();

        if(inicio >= 12){
            duracao = dia - inicio + fim;
        }else if(inicio < 12 && fim < 12){
            duracao = dia + inicio - fim ;
        }else if(inicio < 12 && fim > 12){
            duracao = fim - inicio;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        s.close();
    }
}
