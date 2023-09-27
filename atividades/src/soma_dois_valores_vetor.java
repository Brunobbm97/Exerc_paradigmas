import java.util.Scanner;

public class soma_dois_valores_vetor {
    public static void main(String[] args) {
        boolean valor = true;
        int[] vetor = new int[8];
        int x = 0,y = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número da posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        while (valor) {
            System.out.print("Digite o valor de X: ");
            x = scanner.nextInt();

            System.out.print("Digite o valor de Y: ");
            y = scanner.nextInt();

            if (x < 8 && x > 0 && y < 8 && y > 0) {
                valor = false;
            }

            if (!(x < 8 && x > 0 && y < 8 && y > 0)) {
                System.out.println("Alguma posição Inválida");
            }
        }

        int soma = vetor[x - 1] + vetor[y - 1];
        System.out.println("A soma dos valores nas posições X e Y é: " + soma);

        scanner.close();
    }
}