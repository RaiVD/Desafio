package Desafio;

import java.util.Scanner;
import java.util.Random;

public class Desafio1 {
    public static void main(String[] args) {
        System.out.println("\n----------------Jogo dos Dados---------------");
        System.out.println("\n------------------Instruções----------------");
        System.out.println("ºVocê tem direito a 5 rodadas!");
        System.out.println("ºCaso o seu numero for igual ao numero gerado: ganha 10 pontos!");
        System.out.println("ºCaso o seu número for diferente do numero gerado e estiver um número\n acima ou um número abaixo do número sorteado: ganha 5 pontos!");
        System.out.println("ºCaso o seu numero for diferente do numero gerado e não for um número\n acima ou um número abaixo: Perdeu a rodada!");
        int ponto1 = 0;
        int ganhou = 0;
        int perdeu = 0;
        int rodadaInvalida = 0;

        for (int i = 0; i < 5; i++) {

            Scanner numerodoUsuario = new Scanner(System.in);
            System.out.println("--------------------------------------------");
            System.out.println("Digite um numero entre 0 e 10: ");
            int numeroUsuario = numerodoUsuario.nextInt();

            Random random = new Random();
            int numeroAleatorio = random.nextInt(10);
            System.out.println("Numero gerado: " + numeroAleatorio);

            int valorAcima = numeroUsuario + 1;
            int valorAbaixo = numeroUsuario - 1;

            if (numeroUsuario == numeroAleatorio) {
                ponto1 += 10;
                ganhou ++;
                System.out.println("Você ganhou");

            } else if (numeroAleatorio == valorAbaixo || numeroAleatorio == valorAcima) {
                ponto1 += 5;
                ganhou++;
                System.out.println("Você ganhou");

            }else if (numeroUsuario > 10) {
                rodadaInvalida++;
                System.out.println("Número digitado invalido");

            } else {
                perdeu++;
                System.out.println("Você perdeu");
            }
        }
        System.out.println("-------------------------------");

        System.out.println("Rodadas ganhas: " + ganhou + "\nRodadas perdidas: " + perdeu);
        System.out.println("Rodadas Invalidas: " + rodadaInvalida);
        System.out.println("\nPontuação final: " + ponto1);
    }
}
