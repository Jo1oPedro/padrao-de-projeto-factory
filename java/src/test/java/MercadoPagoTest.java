import factory.MercadoPago;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MercadoPagoTest {

    public MercadoPago mercadoPago;

    @BeforeEach
    public void setUp() {
        this.mercadoPago = new MercadoPago();
    }

    @Test
    public void deveRealizarPedidoPixComSucesso() {
        String response = this.mercadoPago.pix("dados do pedido", "dados do usuario");
        assertEquals("dados do pagamento com pix no Mercado Pago", response);
    }

    @Test
    public void deveRealizarPedidoBoletoComSucesso() {
        String response = this.mercadoPago.boleto("dados do pedido", "dados do usuario");
        assertEquals("dados do pagamento com boleto no Mercado Pago", response);
    }

    @Test
    public void deveRealizarPedidoCreditoComSucesso() {
        String response = this.mercadoPago.credito("dados do pedido", "dados do usuario");
        assertEquals("dados do pagamento com credito no Mercado Pago", response);
    }
}
