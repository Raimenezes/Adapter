public class TempoAdapter extends TempoMinuto {
    private Itempo tempoHora;

    public TempoAdapter(Itempo tempoHora){
        this.tempoHora = tempoHora;
    }

    public Integer recuperarTempo() {
        if (this.getMinuto() >= 60)
            tempoHora.setTempo(1);
        else
            if (this.getMinuto() >= 120)
                tempoHora.setTempo(2);
            else
                if (this.getMinuto() >= 180)
                    tempoHora.setTempo(3);
        return tempoHora.getTempo();
    }

    public void salvarTempo(){
        if (tempoHora.getTempo().equals(1))
            this.setMinuto(60);
        else
            if (tempoHora.getTempo().equals(2))
                this.setMinuto(120);
            else
                if (tempoHora.getTempo().equals(3))
                    this.setMinuto(180);
    }
}
