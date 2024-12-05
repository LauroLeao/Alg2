package ATVinterface;

// Main.java
public class TI {
    public static void main(String[] args) {
        // Criar instâncias dos serviços
        servicoAuditoria servicoAuditoria = new servicoAuditoria();
        gerenciaTarefa gerenciadorTarefas = new gerenciaTarefa();

        // Registrar um evento
        servicoAuditoria.registrarEvento("Usuário logado");

        // Enviar uma notificação
        gerenciadorTarefas.enviarNotificacao("Você tem uma nova tarefa!");
    }
}