public class Cliente{
    private String nome;
    private int idade;
    private char sexo;
    private String email, senha;
    
    public Cliente(String nome, int idade, char sexo, String email, String senha){
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    public char getSexo(){
        return sexo;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public String getNome(){
        return nome;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Email: "+email);
        System.out.println("Senha: "+senha);
    }
}