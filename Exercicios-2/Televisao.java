public class Televisao {
    private String canal;
    private Integer volume;
    private boolean ligado;

    public Televisao(String canal, Integer volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public String getCanal(){
        return canal;
    }

    public void setCanal(String canal){
        this.canal = canal;
    }

    public Integer getVolume(){
        return volume;
    }

    public void setVolume(Integer volume){
        this.volume = volume;
    }
}
