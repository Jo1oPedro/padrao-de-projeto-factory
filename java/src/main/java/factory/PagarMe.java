package factory;

public class PagarMe implements iIntermediadorPagamento {

    @Override
    public String pix(String dadosPedido, String dadosUsuario) {
        return "dados do pagamento com pix na Pagarme";
    }

    @Override
    public String boleto(String dadosPedido, String dadosUsuario) {
        return "dados do pagamento com boleto na Pagarme";
    }

    @Override
    public String credito(String dadosPedido, String dadosUsuario) {
        return "dados do pagamento com credito na Pagarme";
    }
}