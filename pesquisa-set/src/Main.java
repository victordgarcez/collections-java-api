import List.ListaTarefas;
import List.Tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a Lista de Tarefas!");
        System.out.println("-----------------------------------------");

        int condicaopwhile = 1;

        while(condicaopwhile == 1){
            System.out.println("-----------------------------------------");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Exibir tarefa");
            System.out.println("4 - Contar tarefas");
            System.out.println("5 - Marcar tarefa como concluída");
            System.out.println("6 - Mostrar tarefas concluídas");
            System.out.println("7 - Mostrar tarefas pendentes");
            System.out.println("8 - Limpar lista de tarefas");
            System.out.println("9 - Sair");
            System.out.println("-----------------------------------------");


            int opt = scanner.nextInt();

            switch (opt){
                case 1 ->{
                    scanner.nextLine();
                    System.out.println("Nome: ");
                    String nome = scanner.next();
                    System.out.println("Descrição: ");
                    String desc = scanner.next();
                    listaTarefas.adicionarTarefa(new Tarefa(nome, desc));
                }
                case 2 ->  {
                    scanner.nextLine(); // limpar o buffer
                    System.out.print("Nome da tarefa a remover: ");
                    String nome = scanner.nextLine();
                    listaTarefas.removerTarefaPorNome(nome);
                }
                case 3 -> listaTarefas.exibirTarefas();
                case 4 -> listaTarefas.contagemTarefas();
                case 5 -> {
                    scanner.nextLine();
                    System.out.println("Nome: ");
                    String nome = scanner.next();
                    listaTarefas.marcarComoConcluida(nome);
                }
                case 6 -> {
                    System.out.println("Tarefas concluídas:");
                    listaTarefas.exibirTarefasConcluidas();
                }
                case 7 -> {
                    System.out.println("Tarefas pendentes:");
                    listaTarefas.exibirTarefasPendentes();
                }
                case 8 -> listaTarefas.limparListaTarefas();
                case 9 -> condicaopwhile++;

            }
        }

    }
}