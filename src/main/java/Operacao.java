public abstract class Operacao {
    private String descricao;

    public Operacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract void executar();
}
