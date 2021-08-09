package aulas.cap02.exemplos;

import java.io.DataInputStream;
import java.io.IOException;

public class Exemplo5 {
    public static void main(String[] args) {
        String s;
        float largura, comprimento, area, perimetro;
        DataInputStream dado;
        try {
            System.out.println("Entre com o comprimento:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre com o largura:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo: "+ area);
            System.out.println("Perimetro do retângulo: "+ perimetro);

        } catch (IOException e) {
            System.out.println("Houve um erro na entrada dos dados, "+e.toString());
        }catch (NumberFormatException e) {
            System.out.println("Houve na conversão dos dados, Digite apenas caracteres numéricos "
            +e.toString());
        }
    
    }
}
