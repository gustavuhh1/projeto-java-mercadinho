public abstract class Pessoa {
    protected String nome;
    protected int id;
    protected String cpf;

    public Pessoa(String nome, int id, String cpf) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
