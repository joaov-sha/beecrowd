package Java.Beginner;

import java.util.Scanner;
public class Bee1041{
    public static void main(String[] args){

        // Descrição: Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
        
        Scanner s = new Scanner(System.in);
        float x,y;
        x = s.nextFloat();
        y = s.nextFloat();
        if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }else if(x == y && x == 0){
            System.out.println("Origem");
        }else if(x != 0 && y == 0){
            System.out.println("Eixo X");
        }else if(x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
        s.close();
    }
}