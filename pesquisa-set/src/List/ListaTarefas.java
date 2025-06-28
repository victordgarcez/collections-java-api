package List;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    //get
    public Set<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    //construtor
    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }


    //metodos
    public void adicionarTarefa(Tarefa tarefa) {
        listaTarefas.add(new Tarefa(tarefa.getNome(), tarefa.getDescricao()));
    }

    public void removerTarefaPorNome(String nome) {
        Tarefa tarefaParaRemover = null;

        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nome)) {
                tarefaParaRemover = tarefa;
                break;
            }
        }

        if (tarefaParaRemover != null) {
            listaTarefas.remove(tarefaParaRemover);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void exibirTarefas() {
        if (!listaTarefas.isEmpty()) {
            System.out.println(listaTarefas);
        } else {
            System.out.println("Sua lista de tarefas está vazia!");
        }
    }

    public void contagemTarefas() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Sua lista de tarefas está vazia.");
            return;
        }

        int numtarefa = 1;

        for (Tarefa tarefa : listaTarefas) {
            System.out.printf("[%d] Nome: %s - Descrição: %s\n",
                    numtarefa++, tarefa.getNome(), tarefa.getDescricao(), tarefa.isStatus());
        }

    }


    public void marcarComoConcluida(String nome) {
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nome)) {
                tarefa.setStatus(true);
                System.out.println("Tarefa marcada como concluída.");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }


    public void limparListaTarefas() {
        if (listaTarefas.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            listaTarefas.clear();
        }
    }

    public void exibirTarefasConcluidas() {
        boolean encontrou = false;
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.isConcluida()) {
                System.out.println(tarefa);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma tarefa concluída encontrada.");
        }


    }

    public void exibirTarefasPendentes() {
        boolean encontrou = false;
        for (Tarefa tarefa : listaTarefas) {
            if (!tarefa.isConcluida()) {
                System.out.println(tarefa);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma tarefa pendente encontrada.");
        }
    }

}