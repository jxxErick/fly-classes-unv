import java.util.Date;

public class Voo {
    private String numeroVoo;
    private Date data;
    private Date horaPartida;
    private Date horaChegada;
    private String origem;
    private String destino;
    private int assentosDisponiveis;

    public Voo(String numeroVoo, Date data, Date horaPartida, Date horaChegada, String origem, String destino, int assentosDisponiveis) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.origem = origem;
        this.destino = destino;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public boolean verificarDisponibilidade() {
        return assentosDisponiveis > 0;
    }

    public void reservarAssento() {
        if (verificarDisponibilidade()) {
            assentosDisponiveis--;
        }
    }

    public void cancelarAssento() {
        assentosDisponiveis++;
    }
}