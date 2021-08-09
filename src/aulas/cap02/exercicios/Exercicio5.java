package aulas.cap02.exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {
    /*
    Considere a seguinte informação a respeito do cálculo da aposentadoria. 
    Para se aposentar por idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65. 
    Já na aposentadoria por tempo de contribuição, o tempo mínimo exigido é de 30 anos para 
    as mulheres e de 35 anos para os homens. Com base nessas informações, elabore uma classe 
    que receba a idade de uma pessoa, seu sexo e a quantidade de anos de contribuição. 
    A seguir, calcule a quantidade de anos que falta de contribuição para se aposentar, 
    ou então emita a mensagem: “você já tem o direito a aposentadoria”.
    */
    public static void main(String[] args) {
          
        int idade, tempo_contribuicao, restante_idade, restante_contribuicao;
        String aux, sexo;
        try {
            aux = JOptionPane.showInputDialog(null,"Insira a Idade:");
            idade = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog(null,"Insira o Tempo de Contribuição:");
            tempo_contribuicao = Integer.parseInt(aux);

            sexo = JOptionPane.showInputDialog(null,"Insira o Sexo M ou F:");
            switch (sexo){
                case "M": if(idade<65) {
                    restante_idade = 65 - idade;
                    JOptionPane.showMessageDialog(null, "Você não tem o direito falta: "+restante_idade+ " anos");
                } else if (tempo_contribuicao <35){
                    restante_contribuicao = 35 - tempo_contribuicao;
                    JOptionPane.showMessageDialog(null, "Você não tem o direito falta: "+restante_contribuicao+ " anos");  
                } else {
                    JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria!");
                } break;

                case "F": if(idade<60) {
                    restante_idade = 60 - idade;
                    JOptionPane.showMessageDialog(null, "Você não tem o direito falta: "+restante_idade+ " anos");
                } else if (tempo_contribuicao <30){
                    restante_contribuicao = 30 - tempo_contribuicao;
                    JOptionPane.showMessageDialog(null, "Você não tem o direito falta: "+restante_contribuicao+ " anos");  
                } else {
                    JOptionPane.showMessageDialog(null, "Você já tem o direito a aposentadoria!");
                } break;
                default:
                JOptionPane.showMessageDialog(null, "Sexo desconhecido!");
            }

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Digite apenas números: \n" + e);
            }
        }
    
    
}
