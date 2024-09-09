public class Validador {

    public static boolean validarCPF(String cpf) {
        // Remover pontuação (separadores como . e -)
        cpf = cpf.replaceAll("\\D", "");

        // Verificar se tem 11 dígitos
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcular o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }

        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador > 9) {
            primeiroDigitoVerificador = 0;
        }

        // Calcular o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }

        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador > 9) {
            segundoDigitoVerificador = 0;
        }

        // Verificar se os dígitos verificadores estão corretos
        return (primeiroDigitoVerificador == cpf.charAt(9) - '0') &&
                (segundoDigitoVerificador == cpf.charAt(10) - '0');
    }

    public static boolean validarCNPJ(String cnpj) {
        // Remover pontuação (separadores como . e -)
        cnpj = cnpj.replaceAll("\\D", "");

        // Verificar se tem 14 dígitos
        if (cnpj.length() != 14 || cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        // Calcular o primeiro dígito verificador
        int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += (cnpj.charAt(i) - '0') * pesos1[i];
        }

        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador > 9) {
            primeiroDigitoVerificador = 0;
        }

        // Calcular o segundo dígito verificador
        int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        soma = 0;
        for (int i = 0; i < 13; i++) {
            soma += (cnpj.charAt(i) - '0') * pesos2[i];
        }

        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador > 9) {
            segundoDigitoVerificador = 0;
        }

        // Verificar se os dígitos verificadores estão corretos
        return (primeiroDigitoVerificador == cnpj.charAt(12) - '0') &&
                (segundoDigitoVerificador == cnpj.charAt(13) - '0');
    }
}
