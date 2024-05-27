package jogoadv;

import java.util.Random;
import java.util.Scanner;

public class JogoAdv {

<<<<<<< HEAD
=======
    public static void Jogo() {

    }

>>>>>>> 258d9b8c502ebe2a2e5c525e433ee3d78297b97a
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        int O;
<<<<<<< HEAD
        
        System.out.println("Digite seu nome: ");
        String nome = l.nextLine();
        
        do {
            System.out.println("Olá " + nome + ", você deseja jogar uma partida de adivinhação?");
=======

        do {
            System.out.println("Você deseja jogar uma partida de adivinhação?");
>>>>>>> 258d9b8c502ebe2a2e5c525e433ee3d78297b97a
            System.out.println("1 - Começar ");
            System.out.println("2 - Sair    ");

            O = l.nextInt();

            switch (O) {
                case 1: {
<<<<<<< HEAD
                    
=======

>>>>>>> 258d9b8c502ebe2a2e5c525e433ee3d78297b97a
                    int n = 0;

                    Random ale = new Random();
                    int a = ale.nextInt(10);

                    for (int i = -1; i <= n; i++) {
                        System.out.println("Digite um número de 0 a 10: ");

                        n = l.nextInt();

                        if (n == a) {
<<<<<<< HEAD
                            System.out.println("Parabéns " + nome + ", você acertou o número!!!");
                            System.out.println("Número sorteado = " + a);
=======
                            System.out.println("Você adivinhou o número, parabèns!!!");
                            System.out.println(a);
>>>>>>> 258d9b8c502ebe2a2e5c525e433ee3d78297b97a
                            break;
                        } else if (n < a) {
                            System.out.println("O número " + n + " é menor que o numero aleatório");
                        } else if (n > a) {
                            System.out.println("O número " + n + " é maior que o numero aleatório");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Saindo");
                    break;
                }
                default: {
                    System.out.println("invalido ");

                    break;
                }
            }

        } while (O != 2);

    }

}
