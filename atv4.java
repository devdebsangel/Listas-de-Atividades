import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicita ao usuário o número de termos da série de Fibonacci
        System.out.print("Digite o número de termos da série de Fibonacci: ");
        int termos = sc.nextInt(); // Recebe o número de termos

        int num1 = 0, num2 = 1; // Inicializa os primeiros dois números da série
        System.out.print("Série de Fibonacci: " + num1 + " " + num2); // Exibe os dois primeiros termos

        // Laço para calcular e exibir os próximos termos da série
        for (int i = 2; i < termos; i++) {
            int num3 = num1 + num2; // Próximo termo é a soma dos dois anteriores
            System.out.print(" " + num3); // Exibe o termo
            num1 = num2; // Atualiza os valores para o próximo ciclo
            num2 = num3;
        }
        System.out.println(); // Pula uma linha no final da série
        sc.close(); // Fecha o scanner
    }
}
