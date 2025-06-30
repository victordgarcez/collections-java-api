import java.util.Scanner;
import Map.ContagemPalavras;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContagemPalavras contagem = new ContagemPalavras();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar palavra");
            System.out.println("2 - Remover palavra");
            System.out.println("3 - Exibir contagem de palavras");
            System.out.println("4 - Exibir palavra mais frequente");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a palavra para adicionar: ");
                    String palavraAdd = scanner.nextLine().toLowerCase();
                    System.out.print("Digite a quantidade a adicionar: ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();
                    contagem.adicionarPalavra(palavraAdd, qtd);
                    System.out.println("Palavra adicionada!");
                    break;
                case 2:
                    System.out.print("Digite a palavra para remover: ");
                    String palavraRem = scanner.nextLine().toLowerCase();
                    contagem.removerPalavra(palavraRem);
                    break;
                case 3:
                    contagem.exibirContagemPalavras();
                    break;
                case 4:
                    contagem.exibirPalavraMaisFrequente();
                    break;
                case 0:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}