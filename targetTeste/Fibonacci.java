package targetTeste;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int proximoTermo = 0;
        
        System.out.println("Digite um número para verificar se pertence ou não a sequência de Fibonacci: ");
        int num = teclado.nextInt(); 
        
        while (proximoTermo <= num) {
            if (num == proximoTermo) {
                System.out.println(num + " pertence à sequência de Fibonacci.");
                break;
            }
            proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        if(num != proximoTermo) {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        teclado.close();
    }
}
