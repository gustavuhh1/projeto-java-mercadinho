public interface Gerenciavel {
    void adicionarItem(Produto produto);
    void removerItem(int idProduct, String nomeProduto) throws ProdutoNotFindException;
}
