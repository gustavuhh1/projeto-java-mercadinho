public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente(1,"João", "123.456.789-00", 200.0);
            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

            ProdutoConcreto produto1 = new ProdutoConcreto(1, "Arroz", 20.0);
            ProdutoConcreto produto2 = new ProdutoConcreto(2,"Feijão", 15.0);

            cliente.exibirInformacoes();

            carrinho.adicionarItem(produto1);
            carrinho.adicionarItem(produto2);

            double total = carrinho.calcularTotal();
            System.out.println("Total do carrinho: R$ " + total);

            cliente.realizarPagamento(total);

        } catch (ProdutoNotFindException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
