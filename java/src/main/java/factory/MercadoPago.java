package factory;

public class MercadoPago implements iIntermediadorPagamento {

    @Override
    public String pix(String dadosPedido, String dadosUsuario) {
        return "dados do pagamento com pix no Mercado Pago";
    }

    @Override
    public String boleto(String dadosPedido, String dadosUsuario) {
        return "dados do pagamento com boleto no Mercado Pago";
    }

    @Override
    public String credito(String dadosPedido, String dadosUsuario) {
        return "dados do pagamento com credito no Mercado Pago";
    }
}
