public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroDePaginas);
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro("Dom Quixote", "Miguel de Cervantes", 863);

        System.out.println("Informações do livro:");
        meuLivro.imprimirInformacoes();
    }
}
