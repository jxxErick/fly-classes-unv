import java.util.Date;

public class Bilhete {
    private String codigoBilhete;
    private Reserva reserva;
    private Date dataEmissao;

    public Bilhete(String codigoBilhete, Reserva reserva) {
        this.codigoBilhete = codigoBilhete;
        this.reserva = reserva;
        this.dataEmissao = new Date();
    }

    public void emitirBilhete() {
        System.out.println("Bilhete emitido com sucesso: " + codigoBilhete);
    }
}