package Exercicio1;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private double preco;
    private int quantidadePaginas;

    public Livro(String titulo, String autor, int anoDePublicacao, double preco, int quantidadePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }

    public double calculaPrecoPorPagina() {
        return this.preco / this.quantidadePaginas;
    }

    public String mostraInformacoes(String titulo, String autor, int anoDePublicacao, double preco, int quantidadePaginas) {
        return "Titulo: " + titulo + "\n"
                + "Autor: " + autor + " Ano de Publicação: " + anoDePublicacao + "\n"
                + "Preço: " + preco + " Número de Páginas: " + quantidadePaginas + "\n";
    }
}
