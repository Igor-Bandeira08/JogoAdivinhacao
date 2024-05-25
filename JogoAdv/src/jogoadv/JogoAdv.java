package jogoadv;

import java.util.Random;
import java.util.Scanner;

public class JogoAdv {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        

        System.out.println("Você deseja jogar uma partida de adivinhação?");
        
        do {
            int o = o = l.nextInt(); ;
            switch (o) {
                case 1: {
                    System.out.println("Continuar");
                }
                case 2: {
                    System.out.println("Sair");
                    
                }
                break;
            }
        } while (o >= 2);

        int n = 0;

        Random ale = new Random();
        int a = ale.nextInt(10);

        for (int i = -1; i <= n; i++) {
            System.out.println("Digite um número de 0 a 10: ");
            n = l.nextInt();

            if (n == a) {
                System.out.println("Você adivinhou o número, parabèns!!!");
                System.out.println(a);
                break;
            } else if (n < a) {
                System.out.println("O número " + n + " é menor que o numero aleatório");
            } else if (n > a) {
                System.out.println("O número " + n + " é maior que o numero aleatório");
            }
        }

    }

}
