public class Main {

    public class Cor {
        int r, g, b;

        public Cor(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }

    public class Computador {
        private String marca;
        private int velocidade;
        private int anoFabricacao;
        private boolean situacaoComputador;

        public Computador(String marca, int velocidade, int anoFabricacao) {
            this.marca = marca;
            this.velocidade = velocidade;
            this.anoFabricacao = anoFabricacao;
        }
    }

    public class Lampada {
        private boolean ligado;

        public Lampada(boolean ligado) {
            this.ligado = ligado;
        }
    }

    public class Produto {
        private String nome, descricao;
        private Double valor;
        private int quantidadeEstoque;

        public Produto(String nome, String descricao, double valor, int quantidadeEstoque) {
            this.nome = nome;
            this.descricao = descricao;
            this.valor = valor;
        }
    }
    public void main(String[] args) {
        class ContaCorrente {
            private int numeroConta;
            private double saldoAtual;

            public ContaCorrente(int numeroConta, double saldoAtual) {
                this.numeroConta = numeroConta;
                this.saldoAtual = saldoAtual;
            }
        }
        ContaCorrente Conta1 = new ContaCorrente(1234, 100.00);
        ContaCorrente Conta2 = new ContaCorrente(8765, -98.00);
        ContaCorrente Conta3 = new ContaCorrente(3342, 3445.80);

    }
}