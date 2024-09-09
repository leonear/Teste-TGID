public class Main {
    public static void main(String[] args) {
        // Criar instâncias de Cliente e Empresa
        Cliente cliente = new Cliente("João", "12345678909", 1000.0);
        Empresa empresa = new Empresa("TechCorp", "12345678000195", 5000.0, 0.02);

        // Criar uma instância de TransacaoService e realizar uma transação
        TransacaoService transacaoService = new TransacaoService();
        transacaoService.realizarTransacao(cliente, empresa, 100.0, "DEPOSITO");

        // Imprimir o estado final das instâncias
        System.out.println("Estado final do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Saldo: " + cliente.getSaldo());

        System.out.println("\nEstado final da Empresa:");
        System.out.println("Nome: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Saldo: " + empresa.getSaldo());

        System.out.println("\nValidação de CPF e CNPJ:");
        String cpf = "12345678909";
        String cnpj = "12345678000195";
        System.out.println("CPF (" + cpf + ") válido: " + Validador.validarCPF(cpf));
        System.out.println("CNPJ (" + cnpj + ") válido: " + Validador.validarCNPJ(cnpj));
    }
}


//Nao consegui aplicar o webhook, por conta do tempo, decidi implementar o desafio com os conhecimentos que tenho,