import factory.MercadoPago;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MercadoPagoTest {

    public MercadoPago mercadoPago;

    @BeforeEach
    public void setUp() {
        mercadoPago = new MercadoPago();
        System.out.println("dale");
    }

    @Test
    public void deveRealizarPedidoPixComSucesso() {
        String response = mercadoPago.pix("dados do pedido", "dados do usuario");
        assertEquals("dados do pagamento com pix no Mercado Pago", response);
    }
}
