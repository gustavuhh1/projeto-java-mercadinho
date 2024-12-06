public class ProdutoSimples extends Produto implements Descontavel {
    public ProdutoSimples(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return getPreco() - (getPreco() * (porcentagem / 100));
    }
}