import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo("1234", new Date(), new Date(), new Date(), "São Paulo", "Rio de Janeiro", 10);

        Passageiro passageiro = new Passageiro("João Silva", "123456789", "99999-9999", 1);

        Reserva reserva = passageiro.fazerReserva(voo);

        if (reserva != null) {
            System.out.println("Reserva realizada com sucesso!");
            System.out.println("Código da reserva: " + reserva);

            Bilhete bilhete = new Bilhete("BILH1234", reserva);
            bilhete.emitirBilhete();
        } else {
            System.out.println("Não foi possível realizar a reserva. Assentos esgotados.");
        }

        passageiro.cancelarReserva(reserva);
        System.out.println("Reserva cancelada com sucesso!");
    }
}