
public class atv3 {
    public static void main(String[] args) {
        // Laço para verificar os números de 1 a 1000
        for (int i = 1; i <= 1000; i++) {
            // Verifica se o número, quando dividido por 11, tem resto 5
            if (i % 11 == 5) {
                System.out.println(i); // Exibe o número que satisfaz a condição
            }
        }
    }
}
