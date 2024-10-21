
import java.util.Random;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Random rnd = new Random(); // Inicializa o gerador de números aleatórios
        int numeroAleatorio = rnd.nextInt(10); // Gera número aleatório entre 0 e 9
        Scanner sc = new Scanner(System.in);
        int tentativa; // Variável para armazenar a tentativa do usuário

        // Laço que continua até o usuário acertar o número
        while (true) {
            System.out.print("Tente adivinhar o número (0 a 9): ");
            tentativa = sc.nextInt(); // Recebe a tentativa do usuário

            // Verifica se o usuário acertou o número
            if (tentativa == numeroAleatorio) {
                System.out.println("ACERTOU!"); // Se acertou, o laço encerra
                break;
            } else if (tentativa < numeroAleatorio) {
                System.out.println("MAIOR"); // Se a tentativa for menor, exibe "MAIOR"
            } else {
                System.out.println("MENOR"); // Se a tentativa for maior, exibe "MENOR"
            }
        }
        sc.close(); // Fecha o scanner
    }
}
