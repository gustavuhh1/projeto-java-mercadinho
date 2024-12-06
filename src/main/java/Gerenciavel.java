public interface Gerenciavel {
    void adicionarItem();
    void removerItem(int idProduct) throws ProdutoNotFindException;
}
