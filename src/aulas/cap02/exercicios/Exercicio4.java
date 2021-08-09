package aulas.cap02.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
    /*
    Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de
    duas provas e de um trabalho. Calcule e mostre a média e o resultado final (aprovado ou reprovado). 
    Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota da prova 2 +
    nota do trabalho) / 3. Considere que a média mínima para aprovação é 6
    */
    public static void main(String[] args) {
        
        float nota1, nota2, nota_trabalho, media;
        String aux, situacao;
        try {
            aux = JOptionPane.showInputDialog(null,"Insira Primeira Nota:");
            nota1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null,"Insira Segunda Nota:");
            nota2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog(null,"Insira a Nota do Trabalho:");
            nota_trabalho = Float.parseFloat(aux);

            media = (nota1 + nota2 + nota_trabalho)/3;
           if(media >= 6.0){
               situacao = "APROVADO!";
            } else {
                situacao = "REPROVADO!";
            }

            JOptionPane.showMessageDialog(null, "O(a) aluno(a) está " + situacao + "\nCom a média: "+media);

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Digite apenas números: \n" + e);
            }
        }
    
    
}
