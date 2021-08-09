package aulas.cap02.exercicios;

import java.util.Scanner;

public class Exercicio2 {
/*
Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros.
O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol. 
O segundo valor corresponde à quantidade de pontos do time lanterna. Considerando que
cada vitória vale 3 pontos, elabore uma classe que calcule o número de vitórias necessárias para
que o time lanterna alcance (ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de
ponto fornecidas sejam 40 e 22, então o número de vitórias apresentada na saída deverá ser 6,
pois (40-22) / 3 = 6. 
*/

    public static void main(String[] args) {
        int pontos_lider, pontos_lanterna, diferenca;
        Scanner dado;
        try {
            System.out.println("Entre com o número de Pontos do Lider:");
            dado = new Scanner(System.in);
            pontos_lider = dado.nextInt();

            System.out.println("Entre com o número de Pontos do Lanterna:");
            dado = new Scanner(System.in);
            pontos_lanterna = dado.nextInt();

            diferenca = (pontos_lider - pontos_lanterna)/3;
            System.out.println("O lanterna precisa de: "+diferenca+" vitórias, para alcançar o líder!" );

        } catch (NumberFormatException e) {
            System.out.println("Houve na conversão dos dados, Digite apenas caracteres numéricos "
            +e.toString());
        }
    
    }
}
