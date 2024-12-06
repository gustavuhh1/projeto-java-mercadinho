import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o id do cliente");
        int id = scanner.nextInt();
        System.out.println("Digite o nome do cliente: (opcional)");
        String name = scanner.next();
        System.out.println("Digite o cpf do cliente: (opcional)");
        String cpf = scanner.next();

        Cliente cliente = new Cliente(id, name, cpf);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        while (true) {
            System.out.println("\n=== MENU DO SISTEMA DE MERCADO ===");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Remover item do carrinho");
            System.out.println("3. Exibir carrinho");
            System.out.println("4. Processar venda");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    carrinho.adicionarItem();

                    System.out.println("Produto adicionado ao carrinho!");
                }
                case 2 -> {
                    System.out.print("Digite o id do produto que deseja remover: ");
                    int idDelete = scanner.nextInt();

                    try {
                        carrinho.removerItem(idDelete);
                        System.out.println("Produto removido do carrinho!");
                    } catch (ProdutoNotFindException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case 3 -> {
                    System.out.println("\n=== CARRINHO ===");
                    System.out.println(carrinho);
                }
                case 4 -> {
                    System.out.println("Digite descricao da venda: (opcional)");
                    String descricao = scanner.next();
                    System.out.println("Digite id da venda:");
                    int idVenda = scanner.nextInt();
                    System.out.println("\n=== PROCESSAR VENDA ===");
                    Venda venda = new Venda(descricao, idVenda, carrinho, cliente);

                    try {
                        carrinho.calcularTotal();
                        System.out.println("Quanto o cliente deseja pagar:");
                        Double valorAPagar = scanner.nextDouble();
                        cliente.setSaldo(valorAPagar);
                        venda.processarVenda();
                        System.out.println("Venda concluída com sucesso!");
                    } catch (SaldoInsuficienteException e) {
                        System.out.println("Erro ao processar venda: " + e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.println("Tchauzinho...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
