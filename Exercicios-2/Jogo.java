public class Jogo {
    private String titulo;
    private String genero;
    private int classificacaoEtaria;

    public Jogo(String titulo, String genero, int classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public void iniciarJogo() {
        System.out.println("Iniciando o jogo: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Classificação Etária: " + classificacaoEtaria + "+");
    }

    public void encerrarJogo() {
        System.out.println("Jogo " + titulo + " encerrado.");
    }

    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("Grand Theft Auto V", "Ação", 18);
        
        jogo1.iniciarJogo();
        jogo1.encerrarJogo();
        
        jogo1.setTitulo("FIFA 23");
        jogo1.setGenero("Esportes");
        jogo1.setClassificacaoEtaria(3);
        
        jogo1.iniciarJogo();
        jogo1.encerrarJogo();
    }
}

