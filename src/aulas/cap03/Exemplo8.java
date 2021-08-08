package aulas.cap03;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Exemplo8 {
    public static void main(String args[]) throws IOException{
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade:"));
            if (idade < 18){
                throw new Exception("Menor de idade, entrada não permitida!");
            } else {
                JOptionPane.showMessageDialog(null, "Idade valida, seja bem-vindo!");
            }
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
}
