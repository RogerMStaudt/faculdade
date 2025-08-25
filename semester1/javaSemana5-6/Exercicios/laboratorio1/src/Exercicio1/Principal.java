package Exercicio1;

public class Principal {
    public static void main(String[] args) {
        Livro HarryPoter = new Livro("Harry Potter e a Pedra Filosofal", "JK Rowling", 2000, 100.58, 363);
        Livro Ego = new Livro("Ego é o Inimigo", "Harry Jansen", 1967, 44.99, 230);
        Livro Historia = new Livro("Homo Sapiens", "Jack Mr", 2015, 23, 134);

        Cliente Roger = new Cliente("Roger Staudt", 18, "Masculino", "roger@gmail", "12345");
        Cliente Miguel = new Cliente("Miguel Luciano", 45, "Masculino", "mgel@gmail", "432fsd");
        Cliente Julia = new Cliente("Julia Haas", 16, "Feminino", "Julia@gmail", "12345");
    }
}