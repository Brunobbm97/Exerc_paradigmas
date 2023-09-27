import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        int somaPares = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
                somaPares += numero;
            } else {
                numerosImpares.add(numero);
            }
        }

        System.out.println("Os números pares digitados são:");
        for (int numero : numerosPares) {
            System.out.println(numero);
        }

        System.out.println("A soma dos números pares digitados é: " + somaPares);

        System.out.println("Os números ímpares digitados são:");
        for (int numero : numerosImpares) {
            System.out.println(numero);
        }

        System.out.println("A quantidade de números ímpares digitados é: " + numerosImpares.size());

        scanner.close();
    }
}
