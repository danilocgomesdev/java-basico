package aulas.cap03;

import javax.swing.*;

public class Exemplo2 {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null,"Forneça o número do mês:");
        if ( aux != null){
            try {
                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12){
                    JOptionPane.showMessageDialog(null,"Número do mês válido: \n" + mes);
                } else{
                    JOptionPane.showMessageDialog(null,"Número do mês inválido: \n" + mes);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Digite apenas valores inteiros: \n" + e);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Operação Cancelada!");
        }
        System.exit(0);
    }
}
