public abstract class Produto {
    protected int idProduct;
    protected String nome;
    protected double preco;

    public Produto(int idProduct, String nome, double preco) {
        this.idProduct =  idProduct;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return idProduct;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduct=" + idProduct +
                ", nome='" + nome + '\'' +
                ", preco:" + preco +
                "R$ }";
    }

    public abstract double calcularPrecoFinal();
}
