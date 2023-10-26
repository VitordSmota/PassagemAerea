package Model;

import java.util.regex.*;


public class Passageiro {
    private String nome;
    private String cpf;

    public Passageiro(String nome, String cpf) throws Exception {
        this.nome = nome;
        this.setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        validaCpf(cpf);
    }

    public boolean validaCpf(String cpf){
        String cpfPattern = "^[0-9]{11}$";
        Pattern pattern = Pattern.compile(cpfPattern);
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()) {
            // Realiza a validação adicional do CPF (algoritmo de verificação)
            return validarCPFAlgoritmo(cpf);
        } else {
            return false; // CPF inválido
        }
    }
    public static boolean validarCPFAlgoritmo(String cpf) {
        int soma = 0;
        int resto;

        // Verifica o primeiro dígito verificador
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        resto = 11 - (soma % 11);
        if (resto == 10 || resto == 11) {
            resto = 0;
        }
        if (resto != Character.getNumericValue(cpf.charAt(9))) {
            return false; // CPF inválido
        }

        soma = 0;

        // Verifica o segundo dígito verificador
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        resto = 11 - (soma % 11);
        if (resto == 10 || resto == 11) {
            resto = 0;
        }
        if (resto != Character.getNumericValue(cpf.charAt(10))) {
            return false; // CPF inválido
        }

        return true; // CPF válido
    }
}
