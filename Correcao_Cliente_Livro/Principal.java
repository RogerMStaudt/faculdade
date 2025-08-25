public class Principal{
    public static void main(String[] args){
        
        int idCliente = 1;
        Cliente cliente1 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"));
        idCliente += 1; //ou: idCLiente++;
        Cliente cliente2 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"));
        idCliente += 1;
        Cliente cliente3 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"));
        
        int idLivro = 1;
        Livro livro1 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leInt("Informe a quantidade de páginas do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"));
        idLivro += 1;
        Livro livro2 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leInt("Informe a quantidade de páginas do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"));
        idLivro += 1;
        Livro livro3 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leInt("Informe a quantidade de páginas do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"));
        
        System.out.println("Preço por página do livro "+livro1.getTitulo()+": R$"+livro1.calcularPrecoPorPagina());
        System.out.println("Preço por página do livro "+livro2.getTitulo()+": R$"+livro2.calcularPrecoPorPagina());
        System.out.println("Preço por página do livro "+livro3.getTitulo()+": R$"+livro3.calcularPrecoPorPagina());
        
        System.out.println("Informações dos objetos criados:");
        System.out.println("*** CLIENTES ***");
        cliente1.imprimeInformacoes();
        cliente2.imprimeInformacoes();
        cliente3.imprimeInformacoes();
        System.out.println("*** LIVROS ***");
        livro1.imprimeInformacoes();
        livro2.imprimeInformacoes();
        livro3.imprimeInformacoes();
    }
}