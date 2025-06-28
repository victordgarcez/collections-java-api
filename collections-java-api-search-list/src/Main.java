//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import List.SomaNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SomaNumeros nums = new SomaNumeros();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo à lista de números!");

        while(true) {
            System.out.println("========================================");
            System.out.println("Escolha a opção que deseja fazer:");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Exibir lista");
            System.out.println("3 - Encontrar número maior");
            System.out.println("4 - Encontrar número menor");
            System.out.println("5 - Calcular soma de todos os números da lista");
            System.out.println("========================================");

            int opt = scanner.nextInt();

            switch (opt) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Digite um número:");
                    int n = scanner.nextInt();
                    nums.adicionarNumero(n);
                }
                case 2 -> nums.exibirNumeros();
                case 3 -> System.out.println(nums.encontrarMaiorNumero());
                case 4 -> System.out.println(nums.encontrarMenorNumero());
                case 5 -> System.out.println(nums.calcularSoma());
            }
        }

    }
}