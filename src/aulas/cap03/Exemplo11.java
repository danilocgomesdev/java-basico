package aulas.cap03;

public class Exemplo11 {
    public static void main(String[] args) {
        int horas, minutos, segundos;
        for ( horas = 0; horas < 24; horas++){
            for ( minutos = 0; minutos < 60; minutos++){
                for ( segundos = 0; segundos < 60; segundos++){
                System.out.println(horas+"h: "+minutos+"min: "+segundos+"s");
                try {
                    Thread.sleep(1000); // executar de 1 em 1segundos
                    if(segundos == 10){
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                    e.toString();
                }
                }
            }
        }
        System.exit(0);
    }
}
