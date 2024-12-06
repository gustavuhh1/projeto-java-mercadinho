public class ProdutoConcreto extends Produto implements Descontavel {
    public ProdutoConcreto(int idProduct, String nome, double preco) {
        super(idProduct, nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco();
    }

    @Override
    public double aplicarDesconto(double porcentagem) {
        return getPreco() - (getPreco() * porcentagem / 100);
    }
}
