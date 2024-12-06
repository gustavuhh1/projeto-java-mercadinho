public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpf;

    public Pessoa(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public abstract void exibirInformacoes();
}
