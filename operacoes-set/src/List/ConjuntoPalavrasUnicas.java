package List;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> palavras;

    //construtor
    public ConjuntoPalavrasUnicas(){
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public void exibirPalavras() {
        if (!palavras.isEmpty()) {
            System.out.println(this.palavras);
        } else {
            System.out.println("A lista está vazia!");
        }
    }


}
