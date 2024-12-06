public abstract class Pessoa {
    protected String nome;
    protected int id;
    protected String cpf;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
