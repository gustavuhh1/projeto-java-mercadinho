import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Venda extends Transacao {
    private Cliente cliente;
    private List<Produto> produtos;

    public Venda(Cliente cliente, List<Produto> produtos) throws ProdutoNaoEncontradoException {
        this.cliente = cliente;
        this.produtos = produtos;
        if( produtos == null){
            throw new ProdutoNaoEncontradoException("Produto não encontrado");
        }
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    public void finalizar() throws SaldoInsuficienteException, IOException {
        double total = calcularTotal();
        cliente.debitar(total);

        Relatorio.registrarVenda(cliente, produtos, LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "Venda realizada para " + cliente.getNome() + " no valor de R$ " + calcularTotal();
    }
}
