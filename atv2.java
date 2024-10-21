import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x; // Declaração das variáveis
        String comando; // Variável para controlar a saída do programa

        // Laço que continua até o usuário digitar "sair"
        while (true) {
            System.out.println("Digite 'sair' para encerrar ou qualquer outra tecla para continuar: ");
            comando = sc.next(); // Recebe a entrada do usuário
            if (comando.equalsIgnoreCase("sair")) {
                break; // Se o usuário digitar "sair", o programa encerra
            }

            // Entrada dos valores da regra de três
            System.out.print("Digite o valor de A: ");
            a = sc.nextDouble();
            System.out.print("Digite o valor de B: ");
            b = sc.nextDouble();
            System.out.print("Digite o valor de C: ");
            c = sc.nextDouble();

            // Cálculo da regra de três simples: A está para B assim como C está para X
            x = (b * c) / a; // Fórmula da regra de três
            System.out.println("Resultado de X na regra de três: " + x);
        }
        sc.close(); // Fecha o scanner
    }
}
