import Map.Dicionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dicionario dictMap = new Dicionario();

        System.out.println("Bem vindo ao seu Dicionário!");
        System.out.println();
        System.out.println("Escolha a operação desejada:");

        int condforwhile = 1;

        while (condforwhile == 1){
            System.out.println("-------------------------------------------");
            System.out.println("1 - Adicionar palavra");
            System.out.println("2 - Remover palavra");
            System.out.println("3 - Exibir palavra");
            System.out.println("4 - Pesquisar por palavra");
            System.out.println("5 - Sair");
            System.out.println("-------------------------------------------");

            int opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt){
                case 1 ->{
                    System.out.println("Palavra: ");
                    String palavra = scanner.next();
                    System.out.println("Descrição: ");
                    String desc = scanner.next();
                    dictMap.adicionarPalavra(palavra, desc);
                }
                case 2 ->{
                    System.out.println("Palavra: ");
                    String palavra = scanner.next();
                    dictMap.removerPalavra(palavra);
                }
                case 3 ->dictMap.exibirPalavras();
                case 4 ->{
                    System.out.println("Palavra: ");
                    String palavra = scanner.next();
                    dictMap.pesquisarPorPalavra(palavra);
                }
                case 5 -> condforwhile++;
            }
        }

    }
}