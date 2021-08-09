package aulas.cap02.exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Exercicio1 {
    /*
      Usando a classe BufferedReader para entrada de dados, 
      crie uma classe que receba o valor de um produto e a porcentagem de desconto, 
      calcule e mostre o valor do desconto e o valor do produto com o desconto. 
      Observação: o valor do desconto é calculado por meio da fórmula: 
      valor do desconto = valor do produto * percentual de desconto / 100.
     */
    public static void main(String[] args) {
        String s;
        float valor_desconto, valor_produto, percentual_desconto;
        BufferedReader dado;
        try {
            System.out.println("Entre com o valor do Produto:");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            valor_produto = Float.parseFloat(s);

            System.out.println("Entre com o Percentual de Desconto:");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            percentual_desconto = Float.parseFloat(s);

            valor_desconto = (valor_produto * percentual_desconto)/100;
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("O Valor de Desconto: R$ "+ df.format(valor_desconto));

        } catch (IOException e) {
            System.out.println("Houve um erro na entrada dos dados, "+e.toString());
        }catch (NumberFormatException e) {
            System.out.println("Houve na conversão dos dados, Digite apenas caracteres numéricos "
            +e.toString());
        }
    
    }
}
