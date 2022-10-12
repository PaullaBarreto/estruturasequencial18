import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) throws Exception {
        double tamanhoArquivo;
        double velocidadeLink;
        double tempoEmSegundos;
        double tempoEmMinutos;
        
        // Ação do usuário: informar o tamanho do arquivo
        Scanner teclado = new Scanner (System.in);
        tamanhoArquivo = teclado.nextDouble();
        velocidadeLink = teclado.nextDouble();
        teclado.close();

        //2) Tarefa do computador
        //2.1) converter de MB para Mb
        tamanhoArquivo = tamanhoArquivo * 8;
        // 2.2) regra de 3 para descobrir o tempo em segundos
        tempoEmSegundos = tamanhoArquivo / velocidadeLink;
        //2.3) converter de segundos para minutos
        tempoEmMinutos = tempoEmSegundos / 60;

        //3) Resposta do computador: o tempo aproximado de download do arquivo
        System.out.print("O tempo em minutos e: " + tempoEmMinutos);
    }
}