import Set.Aluno;
import Set.GerenciadorAlunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciadorAlunos alunos = new GerenciadorAlunos();

    System.out.println("Bem vindo a sua lista de alunos!");

    int condpwhile = 1;

    while (condpwhile == 1){
        System.out.println("-------------------------------------------------------");
        System.out.println("1 - Adicionar aluno");
        System.out.println("2 - Remover aluno por número de matrícula");
        System.out.println("3 - Exibir alunos por ordem alfabética");
        System.out.println("4 - Exibir alunos por nota em ordem crescente");
        System.out.println("5 - Exibir alunos");
        System.out.println("6 - Sair");
        System.out.println("-------------------------------------------------------");

        int opt = scanner.nextInt();

        switch (opt){
            case 1 ->{
                scanner.nextLine();
                System.out.printf("Nome: ");
                String nome = scanner.next();
                System.out.printf("Número de matrícula: ");
                int numMatricula = scanner.nextInt();
                System.out.printf("Nota: ");
                double nota = scanner.nextDouble();
                alunos.adicionarAluno(new Aluno(nome, numMatricula, nota));
            }
            case 2 ->{
                scanner.nextLine();
                System.out.printf("Número de matrícula do aluno a remover: ");
                int numMatricula = scanner.nextInt();
                alunos.removerAlunoPornumMatricula(numMatricula);
            }
            case 3 -> alunos.exibirAlunosPorOrdemAlfabetica();
            case 4 -> alunos.exibirAlunosPorNotaCrescente();
            case 5 -> alunos.exibirAlunos();
            case 6 -> condpwhile++;
        }
    }

    }
}