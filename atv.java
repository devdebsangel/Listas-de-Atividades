
import java.util.Scanner;

public class atv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado; // Declaração das variáveis para armazenar os números e o resultado
        char operacao; // Variável para armazenar a operação escolhida

        // Laço de repetição que continua até o usuário optar por sair
        while (true) {
            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble(); // Entrada do primeiro número
            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble(); // Entrada do segundo número

            // Solicita ao usuário a operação desejada ou a opção de sair
            System.out.print("Escolha a operação (+, -, *, /) ou 'S' para sair: ");
            operacao = sc.next().charAt(0); // Lê o caractere da operação

            // Se a operação for 'S' ou 's', o programa encerra
            if (operacao == 'S' || operacao == 's') {
                System.out.println("Saindo...");
                break;
            }

            // Verifica qual operação o usuário escolheu e executa
            switch (operacao) {
                case '+':
                    resultado = num1 + num2; // Soma
                    System.out.println("Resultado: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2; // Subtração
                    System.out.println("Resultado: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2; // Multiplicação
                    System.out.println("Resultado: " + resultado);
                    break;
                case '/':
                    // Verifica se o segundo número é diferente de zero para evitar divisão por zero
                    if (num2 != 0) {
                        resultado = num1 / num2; // Divisão
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Divisão por zero não permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida."); // Caso o usuário insira uma operação inválida
            }
        }
        sc.close(); // Fecha o scanner
    }
}
