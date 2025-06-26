package List;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    private List<Item> carrinhodeCompras;

    public CarrinhodeCompras() {
        this.carrinhodeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhodeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhodeCompras.isEmpty()) {
            for (Item i : carrinhodeCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            carrinhodeCompras.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double sum = 0;
        for (Item item : carrinhodeCompras) {
            sum += item.getPreco() * item.getQuantidade();
        }
        return sum;
    }

    public void exibirItens() {
        if (carrinhodeCompras.isEmpty()) {
            System.out.println("Carrinho está vazio.");
            return;
        }

        for (int i = 0; i < carrinhodeCompras.size(); i++) {
            Item item = carrinhodeCompras.get(i);
            System.out.printf("[%d] Nome: %s - Preço: R$%.2f - Quantidade: %d\n",
                    i+1, item.getNome(), item.getPreco(), item.getQuantidade());
        }
    }
}
