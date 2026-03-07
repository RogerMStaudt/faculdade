public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Loja:\n" +
                "Nome: " + super.getNome() + "\n" +
                "Quantidade de funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
                "Salário base dos funcionários: " + super.getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + super.getEndereco() + "\n" +
                "Data da fundação: '" + super.getDataFundacao() + "\n" +
                "Seguro dos eletrônicos: " + seguroEletronicos;
    }
}
