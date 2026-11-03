package NotificaçõesDePedidosSemAcoplamento;

    public interface Notificador{
        void enviar(String destinatario, String mensagem);
    }

    class NotificadorEmail implements Notificador{
        @Override 
        public void enviar(String destinatario, String mensagem){
            System.out.println("[E-MAIL] para " + destinatario + ":" + mensagem);
        }
    }

    class NotificadorSMS implements Notificador{
        @Override 
        public void enviar(String destinatario, String mensagem){
            System.out.println("[SMS] para " + destinatario + ":" + mensagem);
        }
    }

    class NotificadorPush implements Notificador{
        @Override 
        public void enviar(String destinatario, String mensagem){
            System.out.println("[PUSH] para " + destinatario + ":" + mensagem);
        }
    }

    class ServicoNotificacoes{
        private final Notificador notificador;

        public ServicoNotificacoes(Notificador notificador){
            this.notificador = notificador;
        }

        public void avisarPedido(String destinatario, int numeroPedido){
            String mensagem = "Pedido #" + numeroPedido + "Saiu seu pedido.";
            notificador.enviar(destinatario, mensagem);
        }
    }