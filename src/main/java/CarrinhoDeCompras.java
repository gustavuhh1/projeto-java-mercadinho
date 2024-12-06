import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class CarrinhoDeCompras implements Gerenciavel {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarItem() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o id do produto: ");
        int id = s.nextInt();
        System.out.println("Digite o nome do produto: ");
        String nome = s.next();
        System.out.println("Digite o preco do produto: ");
        double preco = s.nextDouble();

        Produto novoProduto = new ProdutoConcreto(id, nome, preco);

        produtos.add(novoProduto);
    }


    public void removerItem(int idProduct) throws ProdutoNotFindException {
        for (Produto p : produtos) {
            if (p.getId() == idProduct) {
                produtos.remove(p);
                System.out.println("Produto " + p.getNome() + " removido do carrinho.");
                return;
            }
        }
        throw new ProdutoNotFindException("Produto não encontrado no carrinho.");
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::calcularPrecoFinal).sum();
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "produtos=" + produtos +
                '}';
    }
}
