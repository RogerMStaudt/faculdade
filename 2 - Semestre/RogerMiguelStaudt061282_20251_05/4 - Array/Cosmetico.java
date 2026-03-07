public class Cosmetico extends Loja{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Loja:\n" +
                "Nome: " + super.getNome() + "\n" +
                "Quantidade de funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
                "Salário base dos funcionários: " + super.getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + super.getEndereco() + "\n" +
                "Data da fundação: '" + super.getDataFundacao() + "\n" +
                "Taxa de Comercialização: " + taxaComercializacao;
    }
}
