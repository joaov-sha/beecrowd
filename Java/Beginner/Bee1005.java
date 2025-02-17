package Java.Beginner;

import java.util.Scanner;
public class Bee1005{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // Descrição: Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
        double A, B, media;
        A = s.nextDouble();
        B = s.nextDouble();
        media = (A*3.5+B*7.5)/11;
        System.out.printf("MEDIA = %.5f\n", media);
        s.close();
    }
}