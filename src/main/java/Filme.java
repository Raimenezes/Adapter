public class Filme {
    Itempo tempo;
    TempoAdapter persistencia;

    public Filme() {
        tempo = new TempoHora();
        persistencia = new TempoAdapter(tempo);
    }

    public void setTempo(Integer hora) {
         tempo.setTempo(hora);
         persistencia.salvarTempo();
    }

    public Integer getTempo() {
        return persistencia.recuperarTempo();
    }

    public Integer getMinuto() {
        return persistencia.getMinuto();
    }
}
