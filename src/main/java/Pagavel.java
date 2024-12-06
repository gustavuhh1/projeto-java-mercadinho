public interface Pagavel {
    void realizarPagamento(double valor) throws SaldoInsuficienteException;
}
