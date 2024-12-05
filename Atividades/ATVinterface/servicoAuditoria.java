package ATVinterface;

public class servicoAuditoria implements interRegistro{
    public void registrarEvento(String evento) {
        System.out.println("Evento registrado: " + evento);
    }
}
