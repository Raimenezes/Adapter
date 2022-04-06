public class TempoHora implements Itempo {
    private Integer hora;

    @Override
    public Integer getTempo(){
        return this.hora;
    }

    @Override
    public void setTempo(Integer hora) {
        this.hora = hora;
    }
}
