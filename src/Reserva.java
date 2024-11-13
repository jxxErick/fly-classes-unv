import java.util.Date;

public class Reserva {
    private String codigoReserva;
    private Date dataReserva;
    private Voo voo;
    private Passageiro passageiro;

    public Reserva(String codigoReserva, Date dataReserva, Voo voo, Passageiro passageiro) {
        this.codigoReserva = codigoReserva;
        this.dataReserva = dataReserva;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    public void realizarReserva(Voo voo, Passageiro passageiro) {
        if (voo.verificarDisponibilidade()) {
            voo.reservarAssento();
            this.voo = voo;
            this.passageiro = passageiro;
        }
    }

    public void cancelarReserva() {
        if (voo != null) {
            voo.cancelarAssento();
        }
    }
}
