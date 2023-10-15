public class Serie {
    private String titulo;
    private String genero;
    private int anoLancamento;
    private int numeroTemporadas;
    private boolean emAndamento;

    public Serie(String titulo, String genero, int anoLancamento, int numeroTemporadas, boolean emAndamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.numeroTemporadas = numeroTemporadas;
        this.emAndamento = emAndamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public boolean isEmAndamento() {
        return emAndamento;
    }

    public void imprimirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Número de Temporadas: " + numeroTemporadas);
        if (emAndamento) {
            System.out.println("Status: Em Andamento");
        } else {
            System.out.println("Status: Concluída");
        }
    }

    public static void main(String[] args) {
        Serie minhaSerie = new Serie("Breaking Bad", "Drama", 2008, 5, true);

        System.out.println("Informações da Série:");
        minhaSerie.imprimirInformacoes();
    }
}
