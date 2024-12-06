public class main {
    public static void main(String[] args) {
        try  {
            // criar o menu aqui BORAAA MOSCOW MULE

            Cliente cliente = new Cliente(1,"João", "123.456.789-00", 200.0);
            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();


            cliente.exibirInformacoes();

            carrinho.adicionarItem();
            carrinho.adicionarItem();

            carrinho.removerItem(5);

            double total = carrinho.calcularTotal();
            System.out.println("Total do carrinho: R$ " + total);

            cliente.realizarPagamento(total);

        } catch (ProdutoNotFindException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
