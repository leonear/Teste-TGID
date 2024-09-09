public class Transacao {
    private Cliente cliente;
    private Empresa empresa;
    private double valor;
    private String tipoTransacao; // "DEPOSITO" ou "SAQUE"
    private boolean sucesso;
    private String notificacaoStatus;

    // Construtor
    public Transacao(Cliente cliente, Empresa empresa, double valor, String tipoTransacao, boolean sucesso, String notificacaoStatus) {
        this.cliente = cliente;
        this.empresa = empresa;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.sucesso = sucesso;
        this.notificacaoStatus = notificacaoStatus;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getNotificacaoStatus() {
        return notificacaoStatus;
    }

    public void setNotificacaoStatus(String notificacaoStatus) {
        this.notificacaoStatus = notificacaoStatus;
    }
}
