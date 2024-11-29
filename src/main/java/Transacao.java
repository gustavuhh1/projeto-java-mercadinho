import java.time.LocalDateTime;

public abstract class Transacao {
    private LocalDateTime dataHora;

    public Transacao() {
        this.dataHora = LocalDateTime.now();
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "Transação em: " + dataHora;
    }
}