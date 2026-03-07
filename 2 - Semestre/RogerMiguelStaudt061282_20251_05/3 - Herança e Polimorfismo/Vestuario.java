public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Loja:\n" +
                "Nome: " + super.getNome() + "\n" +
                "Quantidade de funcionários: " + super.getQuantidadeFuncionarios() + "\n" +
                "Salário base dos funcionários: " + super.getSalarioBaseFuncionario() + "\n" +
                "Endereço: " + super.getEndereco() + "\n" +
                "Data da fundação: '" + super.getDataFundacao() + "\n" +
                "Produtos importados: " + produtosImportados;
    }
}
