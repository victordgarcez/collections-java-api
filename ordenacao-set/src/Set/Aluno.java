package Set;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int numMatricula;
    private double nota;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //construtores
    public Aluno(String nome, int numMatricula, double nota) {
        this.nome = nome;
        this.numMatricula = numMatricula;
        this.nota = nota;
    }

    //Overrides
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return numMatricula == aluno.numMatricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numMatricula);
    }

    //to string
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numMatricula=" + numMatricula +
                ", nota=" + nota +
                '}';
    }
}


