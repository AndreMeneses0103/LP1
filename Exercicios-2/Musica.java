public class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo a música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracaoSegundos + " segundos");
    }

    public static void main(String[] args) {
        Musica musica1 = new Musica("Bohemian Rhapsody", "Queen", 354);

        System.out.println("Detalhes da Música 1:");
        musica1.reproduzir();

        musica1.setTitulo("Get Lucky");
        musica1.setArtista("Daft Punk");
        musica1.setDuracaoSegundos(370);

        System.out.println("\nDetalhes atualizados da Música 1:");
        musica1.reproduzir();
    }
}

