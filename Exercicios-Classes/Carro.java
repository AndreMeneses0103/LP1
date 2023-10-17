public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("O carro está ligado.");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("O carro está desligado.");
            ligado = false;
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public boolean estaLigado() {
        return ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2021);

        meuCarro.ligar();
        meuCarro.desligar();
        meuCarro.desligar(); // Já está desligado, exibirá uma mensagem apropriada.

        if (meuCarro.estaLigado()) {
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro está desligado.");
        }

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
    }
}