import List.ConjuntoPalavrasUnicas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();
        Scanner scanner = new Scanner(System.in);

        int condicaopwhile = 1;

        System.out.println("Deseje a opção desejada:");

        System.out.println();

        while (condicaopwhile == 1){

            System.out.println("---------------------------------------------");
            System.out.println("1 - Adicionar palavra");
            System.out.println("2 - Remover palavra");
            System.out.println("3 - Verificar palavra");
            System.out.println("4 - Exibir palavras");
            System.out.println("5 - Sair");

            System.out.println("---------------------------------------------");

            int opt = scanner.nextInt();

            switch (opt){
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Digite a palavra: ");
                    String palavra = scanner.next();
                    palavras.adicionarPalavra(palavra);
                }
                case 2 -> {
                    scanner.nextLine();
                    System.out.println("Digite a palavra: ");
                    String palavra = scanner.next();
                    palavras.removerPalavra(palavra);
                }
                case 3 ->{
                    scanner.nextLine();
                    System.out.println("Digite a palavra: ");
                    String palavra = scanner.next();
                    if (palavras.verificarPalavra(palavra) == true){
                        System.out.println("Essa palavra já existe!");
                    }else{
                        System.out.println("Esta palavra ainda não está na lista!");
                    }
                }
                case 4 -> palavras.exibirPalavras();
                case 5 -> condicaopwhile++;
            }
        }
    }
}