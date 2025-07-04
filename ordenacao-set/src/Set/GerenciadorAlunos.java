package Set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos  {
    //atributo
    private Set<Aluno> alunoSet;

    //construtores
    public GerenciadorAlunos(){
        this.alunoSet = new HashSet<>();
    }

    //metodos
    public void adicionarAluno(Aluno aluno){
        this.alunoSet.add(new Aluno(aluno.getNome(), aluno.getNumMatricula(), aluno.getNota()));
    }

    public void removerAlunoPornumMatricula(int numMatricula) {
        Aluno alunoParaRemover = null;

        for (Aluno aluno : alunoSet) {
            if (aluno.getNumMatricula() == numMatricula) {
                alunoParaRemover = aluno;
                break;
            }
        }


        if (alunoParaRemover != null) {
            alunoSet.remove(alunoParaRemover);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public Set<Aluno> exibirAlunosPorOrdemAlfabetica() {
        Set<Aluno> listaOrdenada = new TreeSet<>(alunoSet);
        for (Aluno aluno : listaOrdenada) {
            System.out.println(aluno);
        }
        return listaOrdenada;
    }


    public void exibirAlunosPorNotaCrescente() {
        List<Aluno> listaOrdenada = new ArrayList<>(alunoSet);
        listaOrdenada.sort(Comparator.comparingDouble(Aluno::getNota));

        for (Aluno aluno : listaOrdenada) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunos() {
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        } else {
            System.out.println("Sua lista de alunos está vazia!");
        }
    }



}
