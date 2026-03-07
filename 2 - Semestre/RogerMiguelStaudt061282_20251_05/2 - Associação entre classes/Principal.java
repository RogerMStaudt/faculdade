public class Principal {
    public static void main(String[] args) {
        String menu = "(1) criar uma loja\n" + "(2) criar um produto\n" + "(3) sair";
        int opcaoEscolhida = respostaDoUsuario(menu);
        Loja loja = null;
        Produto produto = null;

        while (opcaoEscolhida != 3) {
            if (opcaoEscolhida == 1) {
                String nomeDaLoja = Teclado.leString("Digite o nome da loja:");
                int quantidadeFuncionarios = Teclado.leInt("Digite a quantidade de funcionários:");
                double salarioBaseFuncionario = Teclado.leDouble("Digite o salário base:");
                String nomeDaRua = Teclado.leString("Digite o nome da rua do endereço:");
                String cidade = Teclado.leString("Digite a cidade do endereço:");
                String estado = Teclado.leString("Digite o estado do endereço:");
                String pais = Teclado.leString("Digite o país do endereço:");
                String cep = Teclado.leString("Digite o CEP do endereço:");
                String numero = Teclado.leString("Digite o número do endereço:");
                String complemento = Teclado.leString("Digite o complemento do endereço:");
                int diaDaFundacao = Teclado.leInt("Digite o dia da fundação da loja:");
                int mesDaFundacao = Teclado.leInt("Digite o mês da fundação da loja:");
                int anoDaFundacao = Teclado.leInt("Digite o ano da fundação da loja:");

                loja = new Loja(nomeDaLoja, quantidadeFuncionarios, salarioBaseFuncionario, new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento), new Data(diaDaFundacao, mesDaFundacao, anoDaFundacao));

                System.out.println(loja.toString());
            } else if (opcaoEscolhida == 2) {
                String nome = Teclado.leString("Digite o nome do produto:");
                double preco = Teclado.leDouble("Digite o preço base:");
                int diaDaValidade = Teclado.leInt("Digite o dia da validade do produto:");
                int mesDaValidade = Teclado.leInt("Digite o mês da validade do produto:");
                int anoDaValidade = Teclado.leInt("Digite o ano da validade do produto:");

                Data dataDeValidade = new Data(diaDaValidade, mesDaValidade, anoDaValidade);

                produto = new Produto(nome, preco, dataDeValidade);

                if (produto.estaVencido(new Data(20, 10, 2023))) {
                    System.out.println("PRODUTO VENCIDO");
                } else {
                    System.out.println("PRODUTO NÃO VENCIDO");
                }
            } else  {
                System.out.println("Opção inválida");
            }

            opcaoEscolhida = respostaDoUsuario(menu);
        }
        System.out.println("Obrigado por usar nosso programa!");
    }

    public static int respostaDoUsuario(String textoDoMenu) {
        return Teclado.leInt(textoDoMenu);
    }
}
