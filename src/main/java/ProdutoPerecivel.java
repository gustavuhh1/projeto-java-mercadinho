public class ProdutoPerecivel extends Produto{
    private int diasParaVencimento;

    public ProdutoPerecivel(int idProduct, String nome, int preco, int diasParaVencimento) {
        super(idProduct, nome, preco);
        this.diasParaVencimento = diasParaVencimento;
    }


    public int getDiasParaVencimento() {
        return diasParaVencimento;
    }

    public void setDiasParaVencimento(int diasParaVencimento) {
        this.diasParaVencimento = diasParaVencimento;
    }

    @Override
    public double calcularPrecoFinal() {
        if (diasParaVencimento <= 5){
            return getPreco() * 0.5;
        }
        return getPreco();
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "idProduct=" + idProduct +
                ", diasParaVencimento:" + diasParaVencimento +
                ", nome:'" + nome + '\'' +
                '}';
    }
}
