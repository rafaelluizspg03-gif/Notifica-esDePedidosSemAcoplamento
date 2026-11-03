package NotificaçõesDePedidosSemAcoplamento;

    class Main {
    public static void main(String[] args){
        ServicoNotificacoes ServicoEmail = new ServicoNotificacoes(new NotificadorEmail());
        ServicoEmail.avisarPedido("rafaelluizspg03@gmail.com", 126);

        ServicoNotificacoes ServicoSMS = new ServicoNotificacoes(new NotificadorSMS());
        ServicoSMS.avisarPedido("(21) 98116-6552", 127);

        ServicoNotificacoes ServicoPUSH = new ServicoNotificacoes(new NotificadorPush());
        ServicoPUSH.avisarPedido("usuario-128", 128);

        ServicoNotificacoes ServicoZAP = new ServicoNotificacoes(new NotificadorWhatsApp());
        ServicoZAP.avisarPedido("(21) 96745-2438", 129);
    }
}
