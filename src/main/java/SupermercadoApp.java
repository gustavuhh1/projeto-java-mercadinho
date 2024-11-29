import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SupermercadoApp {
    public static void main(String[] args) {
        try {

            Cliente cliente = new Cliente("João Silva", "123.456.789-00", 100.0);


            Produto produto1 = new ProdutoSimples(1, "Arroz", 20.0);
            Produto produto2 = new ProdutoSimples(2, "Feijão", 10.0);


            List<Produto> produtos = new ArrayList<>();
            produtos.add(produto1);
            produtos.add(produto2);


            Venda venda = new Venda(cliente, produtos);
            System.out.println(venda);
            venda.finalizar();


            System.out.println("Venda concluída!");
            System.out.println(cliente);

        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao manipular arquivos: " + e.getMessage());
        } catch (ProdutoNaoEncontradoException e) {
            throw new RuntimeException(e);
        }
    }
}
