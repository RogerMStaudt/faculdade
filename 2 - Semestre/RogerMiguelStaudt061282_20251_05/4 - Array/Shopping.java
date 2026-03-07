public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        if (loja == null) {
            return false;
        }

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String loja) {
        int quantidade = 0;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) continue;

            if (loja.equals("Cosmético") && lojas[i] instanceof Cosmetico) {
                quantidade++;
            } else if (loja.equals("Vestuário") && lojas[i] instanceof Vestuario) {
                quantidade++;
            } else if (loja.equals("Bijuteria") && lojas[i] instanceof Bijuteria) {
                quantidade++;
            } else if (loja.equals("Alimentação") && lojas[i] instanceof Alimentacao) {
                quantidade++;
            } else if (loja.equals("Informática") && lojas[i] instanceof Informatica) {
                quantidade++;
            }
        }

        if (quantidade == 0) return -1;

        return quantidade;
    }

    public Informatica lojaSeguroMaisCaro() {
        double valorSeguro = 0.0;
        int numeroInstancia = -1;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                Informatica informatica = (Informatica) lojas[i];

                if (informatica.getSeguroEletronicos() > valorSeguro) {
                    valorSeguro = informatica.getSeguroEletronicos();
                    numeroInstancia = i;
                }
            }
        }

        if (numeroInstancia > -1) {
            Informatica informatica = (Informatica) lojas[numeroInstancia];

            return informatica;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Shopping:\n" +
                "Nome: " + nome + "\n" +
                "Endereço: " + endereco.toString() + "\n" +
                "Quantidade de Lojas: " + lojas.length;
    }
}
