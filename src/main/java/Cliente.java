public class Cliente extends Pessoa {
    private double saldo;

    public Cliente(String nome, String cpf, double saldo) {
        super(nome, cpf);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para debitar R$ " + valor);
        }
        saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString() + " (Saldo: R$ " + saldo + ")";
    }
}