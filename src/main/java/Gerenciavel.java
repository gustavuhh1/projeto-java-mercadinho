public interface Gerenciavel {
    void adicionarItem(Produto produto);
    void removerItem(String nomeProduto) throws ProdutoNotFindException;
}
