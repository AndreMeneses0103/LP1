public class Prato {
    private String nome;
    private String descricao;
    private double preco;

    public Prato(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome do Prato: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
    }

    public static void main(String[] args) {
        Prato prato1 = new Prato("Frango Grelhado", "Peito de frango grelhado com legumes", 15.99);

        System.out.println("Detalhes do Prato 1:");
        prato1.imprimirDetalhes();

        prato1.setNome("Salmão Grelhado");
        prato1.setDescricao("Filé de salmão grelhado com limão");
        prato1.setPreco(18.99);

        System.out.println("\nDetalhes atualizados do Prato 1:");
        prato1.imprimirDetalhes();
    }
}
