public class Cliente extends Pessoa implements Pagavel {
    private double saldo;

    public Cliente(int id, String nome, String cpf, double saldoInicial) {
        super(id, nome, cpf);
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente: " + getNome() + " | CPF: " + getCpf() + " | Saldo: R$ " + saldo);
    }

    @Override
    public void realizarPagamento(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o pagamento de R$ " + valor);
        }
        saldo -= valor;
        System.out.println("Pagamento de R$ " + valor + " realizado com sucesso.");
    }
}
