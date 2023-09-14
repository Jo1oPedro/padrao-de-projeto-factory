package factory;

public interface iIntermediadorPagamento {
    public String pix(String dadosPedido, String dadosUsuario);
    public String boleto(String dadosPedido, String dadosUsuario);
    public String credito(String dadosPedido, String dadosUsuario);
}
