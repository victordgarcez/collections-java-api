package Map;
import java.util.*;

public class LivrariaOnline  {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        if (livroMap.containsKey(link)) {
            System.out.println("Erro: ISBN já existe na livraria!");
            return;
        }
        Livro novoLivro = new Livro(titulo, autor, preco);
        livroMap.put(link, novoLivro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livroMap.remove(chave);
        }

        if (chavesRemover.isEmpty()) {
            System.out.println("Livro não encontrado.");
        } else {
            System.out.println("Livro(s) removido(s) com sucesso.");
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> listaOrdenada = new ArrayList<>(livroMap.entrySet());
        listaOrdenada.sort(new ComparatorPorPreco());

        Map<String, Livro> resultado = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : listaOrdenada) {
            resultado.put(entry.getKey(), entry.getValue());
        }
        return resultado;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> listaOrdenada = new ArrayList<>(livroMap.entrySet());
        listaOrdenada.sort(new ComparatorPorAutor());

        Map<String, Livro> resultado = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : listaOrdenada) {
            resultado.put(entry.getKey(), entry.getValue());
        }
        return resultado;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> resultado = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                resultado.put(entry.getKey(), entry.getValue());
            }
        }
        return resultado;
    }

    public List<Livro> obterLivroMaisCaro() {
        if (livroMap.isEmpty()) {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        double maiorPreco = livroMap.values()
                .stream()
                .mapToDouble(Livro::getPreco)
                .max()
                .orElseThrow();

        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livroMap.values()) {
            if (livro.getPreco() == maiorPreco) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public List<Livro> obterLivroMaisBarato() {
        if (livroMap.isEmpty()) {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        double menorPreco = livroMap.values()
                .stream()
                .mapToDouble(Livro::getPreco)
                .min()
                .orElseThrow();

        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livroMap.values()) {
            if (livro.getPreco() == menorPreco) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
}
