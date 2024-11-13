import java.util.Date;

public class Passageiro {
    private String nome;
    private String documentoIdentidade;
    private String telefone;
    private int idPassageiro;

    public Passageiro(String nome, String documentoIdentidade, String telefone, int idPassageiro) {
        this.nome = nome;
        this.documentoIdentidade = documentoIdentidade;
        this.telefone = telefone;
        this.idPassageiro = idPassageiro;
    }

    public Reserva fazerReserva(Voo voo) {
        if (voo.verificarDisponibilidade()) {
            Reserva reserva = new Reserva("RES" + idPassageiro, new Date(), voo, this);
            reserva.realizarReserva(voo, this);
            return reserva;
        }
        return null;
    }

    public void cancelarReserva(Reserva reserva) {
        if (reserva != null) {
            reserva.cancelarReserva();
        }
    }
}