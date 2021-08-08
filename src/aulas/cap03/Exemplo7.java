package aulas.cap03;

import java.io.*;

import javax.swing.JOptionPane;

public class Exemplo7 {
    public static void main(String[] args) throws IOException {
        String frase = JOptionPane.showInputDialog(null,"Entre com a frase");

        try {
            FileWriter file = new FileWriter("c:/temp/frases.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null,"Frase armazenada no arquivo!");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro, verifique se a pasta c:/temp/ existe! !");
        }
    }
}
