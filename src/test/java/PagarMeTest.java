import factory.MercadoPago;
import factory.PagarMe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagarMeTest {
    public PagarMe pagarMe;

    @BeforeEach
    public void setUp() {
        this.pagarMe = new PagarMe();
    }

    @Test
    public void deveRealizarPedidoPixComSucesso() {
        String response = this.pagarMe.pix("dados do pedido", "dados do usuario");
        assertEquals("dados do pagamento com pix na Pagarme", response);
    }

    @Test
    public void deveRealizarPedidoBoletoComSucesso() {
        String response = this.pagarMe.boleto("dados do pedido", "dados do usuario");
        assertEquals("dados do pagamento com boleto na Pagarme", response);
    }

    @Test
    public void deveRealizarPedidoCreditoComSucesso() {
        String response = this.pagarMe.credito("dados do pedido", "dados do usuario");
        assertEquals("dados do pagamento com credito na Pagarme", response);
    }
}
