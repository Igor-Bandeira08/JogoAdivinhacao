package jogoadv;

import java.util.Random;
import java.util.Scanner;

public class JogoAdv {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        int O;
        int v = 0;
        int c = 0;
        int t = 0;
        System.out.println("Digite seu nome: ");
        String nome = l.nextLine();

        do {
            System.out.println("Olá " + nome + ", você deseja jogar uma partida de adivinhação?");
            System.out.println("1 - Começar ");
            System.out.println("2 - Estatísticas   ");
            System.out.println("3 - Sair   ");

            O = l.nextInt();

            switch (O) {
                case 1: {

                    int n = 0;

                    Random ale = new Random();
                    int a = ale.nextInt(10);

                    for (int i = -1; i < n; ) {

                        System.out.println("Digite um número de 0 a 10: ");
                        n = l.nextInt();
                        t++;

                        if (n == a) {
                            System.out.println("Parabéns " + nome + ", você acertou o número sorteado");
                            System.out.println("Número sorteado = " + a);
                            v++;
                            break;
                        } else if (n < a) {
                            System.out.println("O número " + n + " é menor que o numero aleatório");
                            c++;
                        } else if (n > a) {
                            System.out.println("O número " + n + " é maior que o numero aleatório");
                            c++;
                        }

                    }
                    break;
                }
                case 2: {
                    System.out.println("Deseja ver suas estatísticas?");
                    System.out.println("1 - Ver estatísticas");
                    System.out.println("2 - Sair");
                    O = l.nextInt();

                    switch (O) {
                        case 1: {
                            System.out.println("Você acertou " + v + " em " + t + " tentativas, com " + c + " erros;");
                            break;
                        }
                        default: {
                            System.out.println("Saindo");
                            break;
                        }
                    }

                }

                default: {
                    System.out.println("Saindo, obrigado.");

                    break;
                }
            }

        } while (O != 3);

    }

}
