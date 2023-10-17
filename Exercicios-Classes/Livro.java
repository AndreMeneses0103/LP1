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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroDePaginas);
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 863);
        System.out.println("Informacoes sobre o livro: ");
        livro.imprimirInformacoes();

        livro.setAutor("Machado de Assis");
        livro.setTitulo("Memórias póstumas de Brás Cubas");
        livro.setNumeroDePaginas(320);

        System.out.println("Informacoes sobre o novo livro: ");
        livro.imprimirInformacoes();
    }
}
