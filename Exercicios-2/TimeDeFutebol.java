public class TimeDeFutebol {
    private String nome;
    private String[] jogadores;
    private int numJogadores;
    private int capacidade;

    public TimeDeFutebol(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        jogadores = new String[capacidade];
        numJogadores = 0;
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionarJogador(String jogador) {
        if (numJogadores < capacidade) {
            jogadores[numJogadores] = jogador;
            numJogadores++;
            return true;
        }else{
            System.out.println("Time completo, nao e possivel adicionar " + jogador + ".");
        }
        return false;
    }

    public void exibirEscalacao() {
        System.out.println("Escalacao do time " + nome + ":");
        for (int i = 0; i < numJogadores; i++) {
            System.out.println(jogadores[i]);
        }
    }

    public static void main(String[] args) {
        TimeDeFutebol time = new TimeDeFutebol("Sao Paulo", 11);

        time.adicionarJogador("Rafael");
        time.adicionarJogador("Arboleda");
        time.adicionarJogador("Lucas Moura");
        time.adicionarJogador("Calleri");
        time.adicionarJogador("Nestor");
        time.adicionarJogador("Rafinha");
        time.adicionarJogador("Alisson");
        time.adicionarJogador("W. Rato");
        time.adicionarJogador("Pablo Maia");
        time.adicionarJogador("Beraldo");
        time.adicionarJogador("Caio Paulista");

        //Erro ao adicionar alem do limite
        time.adicionarJogador("Jandrei");

        System.out.println("Nome do Time: " + time.getNome());
        time.exibirEscalacao();
    }
}
