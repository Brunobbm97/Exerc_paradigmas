import java.util.Scanner;

public class sub_vetor {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + i + " do vetor A: ");
            vetorA[i] = scanner.nextInt();
            System.out.print("Digite o elemento " + i + " do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetorC[i]);
        }

        scanner.close();
    }
}
