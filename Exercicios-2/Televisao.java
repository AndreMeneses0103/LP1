public class Televisao {
    private String marca;
    private String canal;
    private Integer volume;
    private boolean ligado;

    public Televisao(String marca, String canal, Integer volume, boolean ligado){
        this.marca = marca;
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public String getCanal(){
        return canal;
    }

    public String getMarca(){
        return marca;
    }

    public Integer getVolume(){
        return volume;
    }

    public boolean getFuncionamento(){
        return ligado;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setCanal(String canal){
        this.canal = canal;
    }


    public void ligar(){
        if(ligado){
            System.out.println("A televisao ja esta ligada!");
        }else{
            ligado = true;
            System.out.println("Ligando televisao...");
        }
    }

    public void desligar(){
        if(!ligado){
            System.out.println("A televisao ja esta desligada!");
        }else{
            ligado = true;
            System.out.println("Desligando televisao...");
        }
    }

    public void aumentarVolume(){
        if(volume >=100){
            System.out.println("Não é possivel aumentar o volume, pois está no máximo.");
        }else{
            volume++;
        }
    }

    public void diminuirVolume(){
        if(volume <= 0){
            System.out.println("Não é possivel diminuir o volume, pois está no mínimo.");
        }else{
            volume--;
        }
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao("LG", "Globo", 0, false);

        tv.ligar();
        tv.ligar();

        for(int x = 0; x < 20; x++){
            tv.aumentarVolume();
        }

        tv.setCanal("SBT");

        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Marca: " + tv.getMarca());
        System.out.println("Volume: " + tv.getVolume());
    }
}
