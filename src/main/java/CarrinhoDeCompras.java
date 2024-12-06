import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras implements Gerenciavel {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarItem(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho.");
    }

    @Override
    public void removerItem(int idProduct, String nomeProduto) throws ProdutoNotFindException {
        for (Produto p : produtos) {
            if (p.getId() == idProduct) {
                produtos.remove(p);
                System.out.println("Produto " + nomeProduto + " removido do carrinho.");
                return;
            }
        }
        throw new ProdutoNotFindException("Produto " + nomeProduto + " não encontrado no carrinho.");
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::calcularPrecoFinal).sum();
    }
}
