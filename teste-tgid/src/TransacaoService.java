public class TransacaoService {

    public void realizarTransacao(Cliente cliente, Empresa empresa, double valor, String tipoTransacao) {
        if ("DEPOSITO".equals(tipoTransacao)) {
            realizarDeposito(cliente, empresa, valor);
        } else if ("SAQUE".equals(tipoTransacao)) {
            realizarSaque(cliente, empresa, valor);
        }
    }

    private void realizarDeposito(Cliente cliente, Empresa empresa, double valor) {
        double taxa = empresa.getTaxaSistema();
        double valorFinal = valor - (valor * taxa);
        cliente.setSaldo(cliente.getSaldo() - valor);
        empresa.setSaldo(empresa.getSaldo() + valorFinal);

        // Simulação de callback
        enviarCallback(empresa, valorFinal);

        // Simulação de notificação
        notificarCliente(cliente);
    }

    private void realizarSaque(Cliente cliente, Empresa empresa, double valor) {
        if (empresa.getSaldo() >= valor) {
            empresa.setSaldo(empresa.getSaldo() - valor);
            cliente.setSaldo(cliente.getSaldo() + valor);

            // Simulação de callback
            enviarCallback(empresa, valor);

            // Simulação de notificação
            notificarCliente(cliente);
        } else {
            System.out.println("Saldo insuficiente na empresa.");
        }
    }

    private void enviarCallback(Empresa empresa, double valor) {
        // Simulação de envio para webhook.site
        System.out.println("Callback enviado para a empresa " + empresa.getNome() + " com valor: " + valor);
    }

    private void notificarCliente(Cliente cliente) {
        // Simulação de notificação (e-mail, SMS, etc.)
        System.out.println("Notificação enviada para o cliente " + cliente.getNome());
    }
}
