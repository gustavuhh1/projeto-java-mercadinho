public interface Processo {
    void processarVenda() throws SaldoInsuficienteException;
    boolean isVendaConcluida();
}
