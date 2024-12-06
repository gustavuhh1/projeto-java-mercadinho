public class Venda extends Operacao implements Processo{
    protected int id;
    protected CarrinhoDeCompras carrinho;
    protected Cliente cliente;
    protected boolean vendaConcluida;
    protected double valorTotal;

    public Venda(String descricao, int id, CarrinhoDeCompras carrinho, Cliente cliente) {
        super(descricao);
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.vendaConcluida = false;
        this.valorTotal = carrinho.calcularTotal();

    }

    public void processarVenda() throws SaldoInsuficienteException {
        if(cliente.getSaldo() < valorTotal){
            throw new SaldoInsuficienteException("Saldo insuficiente" + "Valor total a pagar: " + valorTotal);
        }

        cliente.realizarPagamento(valorTotal);
        vendaConcluida = true;
        System.out.println("Venda realizada com sucesso!");

    }

    public boolean isVendaConcluida() {
        return vendaConcluida;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Venda [Cliente: " + cliente.getNome() + ", Total do Carrinho: R$ " + valorTotal +
                ", Concluída: " + vendaConcluida + "]";
    }

}
