import java.util.Scanner;

public class dados_vetor {
    public static void main(String[] args) {
        boolean valor = true;
        int menor = 0;
        int maior = 0;
        int maiorCinco = 0;
        int[] vetor = new int[10];
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número da posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

            if (i == 0) {
                menor = vetor[i];
            }

            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }

            if (vetor[i] > 5) {
                maiorCinco++;
            }
        }

        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + (double) soma / 10);
        System.out.println("Números maiores que 5: " + maiorCinco);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
