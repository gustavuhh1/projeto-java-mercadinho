import java.io.IOException;
import java.util.List;

public interface Persistencia {
    void salvarArquivo(String caminho, List<Produto> produtos) throws IOException;
    List<Produto> carregarArquivo(String caminho) throws IOException;
}
