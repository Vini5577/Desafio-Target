import java.util.Scanner;

public class inverterString {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        do{
            System.out.println("Digite uma palavra: ");
            String palavra = teclado.nextLine();

            String inverter = "";

            for(int i = palavra.length() - 1; i >= 0; i--) {
                inverter += palavra.charAt(i);
            }

            System.out.println("Palavra invertida: " + inverter );
            System.out.println("Quer continuar? \n1 - SIM\n2 - NÃO");
            op = teclado.nextInt();
            teclado.nextLine();
        
        }while(op != 2);

        teclado.close();
    }
}
