import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class Produto implements Persistencia {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        try {
            salvarArquivo("produtos.csv", List.of(this));  // Salva o produto criado no arquivo CSV
        } catch (IOException e) {
            System.err.println("Erro ao salvar produto: " + e.getMessage());
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void salvarArquivo(String caminho, List<Produto> produtos) throws IOException {
        try (FileWriter writer = new FileWriter(caminho, true)) {
            for (Produto produto : produtos) {
                writer.write(produto.getId() + "," + produto.getNome() + "," + produto.getPreco() + "\n");
            }
        }
    }

    @Override
    public List<Produto> carregarArquivo(String caminho) throws IOException {
        // Aqui você pode implementar a leitura do arquivo CSV
        return null;  // Não implementado neste exemplo, mas pode ser feito com BufferedReader ou Scanner
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " (ID: " + id + ", Preço: R$ " + preco + ")";
    }
}
