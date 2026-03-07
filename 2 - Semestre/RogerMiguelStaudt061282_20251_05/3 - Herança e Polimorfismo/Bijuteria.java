public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Loja:\n" +
                "Nome: " + super.getNome() + "\n" +
                "Quantidade de funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
                "Salário base dos funcionários: " + super.getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + super.getEndereco() + "\n" +
                "Data da fundação: '" + super.getDataFundacao() + "\n" +
                "Meta de vendas: " + metaVendas;
    }
}
