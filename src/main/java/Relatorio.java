import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Relatorio {
    private static final String CAMINHO_ARQUIVO = "relatorio.csv";

    public static void registrarVenda(Cliente cliente, List<Produto> produtos, LocalDateTime dataHora) throws IOException {
        try (FileWriter writer = new FileWriter(CAMINHO_ARQUIVO, true)) {
            writer.write("Data: " + dataHora.toString() + ", Cliente: " + cliente.getNome() + ", Produtos: ");

            for (Produto produto : produtos) {
                writer.write(produto.getNome() + " (R$ " + produto.getPreco() + "), ");
            }

            writer.write("\n");
        }
    }
}
