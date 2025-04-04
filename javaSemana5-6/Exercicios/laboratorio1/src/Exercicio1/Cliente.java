package Exercicio1;

public class Cliente {
    private String nome;
    private int idade;
    private String sexo;
    private String email;
    private String senha;

    public Cliente(String nome, int idade, String sexo, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }

    public String ImprimeInformacoes() {
        return "Nome: " + nome + "\n"
                + "Idade: " + idade + "Sexo: " + sexo + "\n"
                + "Email: " + email + "\n"
                + "Senha: " + senha;
    }
}
