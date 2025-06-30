package Map;

import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LivrariaOnline livraria = new LivrariaOnline();
        boolean executando = true;

        while (executando) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Remover livro por título");
            System.out.println("3 - Exibir livros ordenados por preço");
            System.out.println("4 - Exibir livros ordenados por autor");
            System.out.println("5 - Pesquisar livros por autor");
            System.out.println("6 - Obter livro mais caro");
            System.out.println("7 - Obter livro mais barato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o \n

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ISBN (link): ");
                    String isbn = scanner.nextLine();
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    livraria.adicionarLivro(isbn, titulo, autor, preco);
                    break;

                case 2:
                    System.out.print("Digite o título do livro para remover: ");
                    String tituloRemover = scanner.nextLine();
                    livraria.removerLivro(tituloRemover);
                    break;

                case 3:
                    System.out.println("\nLivros ordenados por preço:");
                    Map<String, Livro> porPreco = livraria.exibirLivrosOrdenadosPorPreco();
                    exibirLivros(porPreco);
                    break;

                case 4:
                    System.out.println("\nLivros ordenados por autor:");
                    Map<String, Livro> porAutor = livraria.exibirLivrosOrdenadosPorAutor();
                    exibirLivros(porAutor);
                    break;

                case 5:
                    System.out.print("Digite o nome do autor: ");
                    String autorBusca = scanner.nextLine();
                    Map<String, Livro> encontrados = livraria.pesquisarLivrosPorAutor(autorBusca);
                    System.out.println("Livros encontrados:");
                    exibirLivros(encontrados);
                    break;

                case 6:
                    try {
                        List<Livro> maisCaros = livraria.obterLivroMaisCaro();
                        System.out.println("\nLivro(s) mais caro(s):");
                        for (Livro livro : maisCaros) {
                            exibirLivro(livro);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    try {
                        List<Livro> maisBaratos = livraria.obterLivroMaisBarato();
                        System.out.println("\nLivro(s) mais barato(s):");
                        for (Livro livro : maisBaratos) {
                            exibirLivro(livro);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0:
                    executando = false;
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    // Método auxiliar para exibir um mapa de livros
    public static void exibirLivros(Map<String, Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            for (Map.Entry<String, Livro> entry : livros.entrySet()) {
                System.out.println("ISBN: " + entry.getKey());
                exibirLivro(entry.getValue());
            }
        }
    }

    // Método auxiliar para exibir um livro
    public static void exibirLivro(Livro livro) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.printf("Preço: R$ %.2f\n", livro.getPreco());
        System.out.println("-----------------------------");
    }
}
