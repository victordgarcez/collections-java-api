import List.CarrinhodeCompras;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        // Criando uma instância do carrinho de compras
        CarrinhodeCompras carrinhoDeCompras = new CarrinhodeCompras();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("o que deseja fazer?");

            System.out.println();

            System.out.println("1 - Adicionar Item (nome preco qtd)");
            System.out.println("2 - Remover item (nome)");
            System.out.println("3 - Exibir itens");
            System.out.println("4 - Calcular valor total");

            System.out.println();

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    scanner.nextLine(); // consumir a quebra de linha pendente
                    System.out.print("Nome do item: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    carrinhoDeCompras.adicionarItem(nome, preco, quantidade);
                }
                case 2 -> {
                    scanner.nextLine(); // consumir a quebra de linha pendente
                    System.out.print("Nome do item a remover: ");
                    String nome = scanner.nextLine();
                    carrinhoDeCompras.removerItem(nome);
                }
                case 3 -> carrinhoDeCompras.exibirItens();
                case 4 -> carrinhoDeCompras.calcularValorTotal();
                default -> System.out.println("Digite uma opção válida!");
            }
            System.out.println();
        }


    }
}