package factory;

public class IntermediadorPagamentoFactory {

    private IntermediadorPagamentoFactory() {}

    public static iIntermediadorPagamento obterIntermediadorPagamento(String nomeMeioPagamento) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("factory." + nomeMeioPagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Intermediador de pagamento inexistente");
        }

        if (!(objeto instanceof iIntermediadorPagamento)) {
            throw new IllegalArgumentException("Intermediador de pagamento inválido");
        }

        return (iIntermediadorPagamento) objeto;
    }
}
