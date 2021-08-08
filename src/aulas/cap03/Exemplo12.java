package aulas.cap03;

import javax.swing.JOptionPane;

public class Exemplo12 {
    public static void main(String[] args) {
        try {
            int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Quantidade" ));
            int contador =  limite;
            while (contador >= 0){
                System.out.println(contador);
                contador--;
            }
            System.out.println("Fim do contador regressivo\n");
            contador = 0;
            do{
                System.out.println(contador);
                contador++;
            } while (contador <= limite);
            System.out.println("Fim do contador Progressivo!");
        } catch (NumberFormatException e) {
            System.out.println("Não foi fornecido um número inteiro válido!" + e.toString());
        }
    }
}
