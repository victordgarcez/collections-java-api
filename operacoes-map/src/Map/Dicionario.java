package Map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> DictMap;

    //construtor
    public Dicionario() {
        this.DictMap = new HashMap<>();
    }

    //metodos
    public void adicionarPalavra(String palavra, String definicao) {
        DictMap.put(palavra, definicao);
        System.out.println("Palavra adicionada com sucesso!");
    }

    public void removerPalavra(String palavra) {
        if (!DictMap.isEmpty()) {
            DictMap.remove(palavra);
            System.out.println("Palavra removida com sucesso!");
        } else {
            System.out.println("Nenhuma palavra existente.");
        }
    }

    public void exibirPalavras() {
        if (!DictMap.isEmpty()) {
            System.out.println(DictMap);
        } else {
            System.out.println("Seu dicionário está vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String significado = DictMap.get(palavra);

        if (significado == null) {
            System.out.println("Palavra não encontrada!");
        } else {
            System.out.println("Palavra encontrada: " + palavra + " → " + significado);
        }

        return significado;
    }
}
