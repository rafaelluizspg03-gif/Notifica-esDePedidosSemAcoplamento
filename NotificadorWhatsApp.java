package NotificaçõesDePedidosSemAcoplamento;

 class NotificadorWhatsApp implements Notificador{
        @Override
        public void enviar(String destinatario, String mensagem){
            System.out.println("[WHATSAPP] Para" + destinatario + ":"+ mensagem);
        }
}
