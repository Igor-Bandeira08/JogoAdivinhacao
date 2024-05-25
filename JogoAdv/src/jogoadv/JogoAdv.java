package jogoadv;

import java.util.Random;
import java.util.Scanner;

public class JogoAdv {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        int n = 1;
        Random ale = new Random();
        int a = ale.nextInt(100);
        for (int i = 0;i<n; i++) {
        System.out.println("Digite um número de 0 a 100: ");
         n = l.nextInt();

        
        
        if (n == a){
            System.out.println("Você adivinhou o número, parabèns!!!");
            System.out.println(a);
            break;
        }else if (n < a){
            System.out.println("O número " + n + " é menor que o numero aleatório");
        }else if (n > a){
            System.out.println("O número " + n + " é maior que o numero aleatório");
        }
       }
        
        

    }

}
