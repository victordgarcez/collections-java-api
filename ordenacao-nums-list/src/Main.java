import List.OrdenacaoNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo à ordenação de números!");

        while(true) {
            System.out.println("========================================");
            System.out.println("Escolha a opção que deseja fazer:");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Exibir lista");
            System.out.println("3 - Ordenar do menor para o maior");
            System.out.println("4 - Ordenar do maior para o menor");
            System.out.println("========================================");

            int opt = scanner.nextInt();

            switch (opt) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Digite um número:");
                    int n = scanner.nextInt();
                    numeros.adicionarNumero(n);
                }
                case 2 -> numeros.exibirNumeros();
                case 3 -> {
                    numeros.ordenarAscendente();
                    numeros.exibirNumeros();
                }
                case 4 -> {
                    numeros.ordenarDescendente();
                    numeros.exibirNumeros();
                }

            }
        }
    }
}