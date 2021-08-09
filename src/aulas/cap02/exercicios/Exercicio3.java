package aulas.cap02.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
    /*
    O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de um imóvel a
    ser negociado. A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior 
    valor entre o valor de transação (o valor negociado) e o valor venal de referência (fornecido pela
    Prefeitura). Com base nisso, elabore uma classe que receba o valor da transação, o valor venal e
    o percentual de imposto. Após isso, encontre o maior valor e aplique o percentual sobre ele. Ao
    final, apresente o valor do imposto a ser pago. Observação: o valor do imposto a ser pago é 
    calculado por meio da fórmula: valor do imposto = maior valor * percentual / 100. Para entrada e saída
    de dados utilize a classe JOptionPane.
    */

    public static void main(String[] args) {
        float valor_transacao, valor_venal, percentual_imposto, valor_imposto, maior_valor;
        String aux;
        try {
            aux = JOptionPane.showInputDialog(null,"Insira o valor da Transação:");
            valor_transacao = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null,"Insira o valor da Venal:");
            valor_venal = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null,"Insira o valor do Percentual de Imposto:");
            percentual_imposto = Float.parseFloat(aux);

            if(valor_transacao > valor_venal){
                maior_valor = valor_transacao;
            } else {
                maior_valor = valor_venal;
            }

            valor_imposto = (maior_valor * percentual_imposto)/100;
            JOptionPane.showMessageDialog(null, "O valor do imposto é = " + valor_imposto);

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Digite apenas números: \n" + e);
            }
        }
    
}
