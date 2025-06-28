package List;

public class Tarefa {
    //atributos
    private String nome;
    private String descricao;
    private boolean status;



    //getters
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    //setter
    public void setStatus(boolean status) {
        this.status = status;
    }

    //construtores
    public Tarefa(String nome, String descricao, boolean status) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = false;
    }

    public boolean isConcluida() {
        return status;
    }

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Tarefa(String nome) {
    }
    //to string

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                '}';
    }
}
