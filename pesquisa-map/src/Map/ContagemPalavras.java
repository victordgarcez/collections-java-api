package Map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    //construtores
    public ContagemPalavras() {
        contagemMap = new HashMap<>();

    }

    //getter
    public Map<String, Integer> getContagemMap() {
        return contagemMap;
    }


    //metodos
    public void adicionarPalavra(String palavra, Integer contagem){
        if (contagemMap.containsKey(palavra)) {
            int contagemAtual = contagemMap.get(palavra);
            contagemMap.put(palavra, contagemAtual + contagem);
        } else {
            contagemMap.put(palavra, contagem);
        }
    }

    public void removerPalavra(String palavra){
        if(contagemMap.containsKey(palavra)){
            contagemMap.remove(palavra);
        }else{
            System.out.println("Palavra inexistente.");
        }
    }

    public void exibirContagemPalavras() {
        if (contagemMap.isEmpty()) {
            System.out.println("Nenhuma palavra registrada.");
            return;
        }

        for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
            System.out.println("Palavra: " + entry.getKey() + " - Contagem: " + entry.getValue());
        }
    }

    public void exibirPalavraMaisFrequente() {
        if (contagemMap.isEmpty()) {
            System.out.println("Nenhuma palavra registrada.");
            return;
        }

        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        System.out.println("Palavra mais frequente: " + palavraMaisFrequente + " - Contagem: " + maiorContagem);
    }


}
