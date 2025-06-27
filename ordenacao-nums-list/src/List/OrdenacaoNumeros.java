package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    public List<Integer> numeros;

    //construtores
    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    //metodos
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void ordenarAscendente(){
        Collections.sort(this.numeros);
    }

    public void ordenarDescendente(){
        Collections.sort(this.numeros, Collections.reverseOrder());
    }

}
