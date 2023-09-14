import factory.IntermediadorPagamentoFactory;
import factory.iIntermediadorPagamento;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class IntermediadorPagamentoFactoryTest {

    @Test
    public void deveRetornarIntermediadorPagamentoInexistente() {
        try {
            iIntermediadorPagamento intermediadorPagamento = IntermediadorPagamentoFactory.obterIntermediadorPagamento("PagSeguro");
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Intermediador de pagamento inexistente", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarIntermediadorPagamentoInvalido() {
        try {
            iIntermediadorPagamento intermediadorPagamento = IntermediadorPagamentoFactory.obterIntermediadorPagamento("OrendaPay");
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Intermediador de pagamento inválido", exception.getMessage());
        }
    }

    @Test
    public void deveRetornarIntermediadorPagamentoComSucesso() {
        try {
            iIntermediadorPagamento intermediadorPagamento = IntermediadorPagamentoFactory.obterIntermediadorPagamento("MercadoPago");
        } catch (Exception exception) {
            fail();
        }
    }
}
