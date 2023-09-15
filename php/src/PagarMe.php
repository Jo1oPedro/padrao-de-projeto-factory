<?php

namespace Factory\Php;

class PagarMe implements iIntermediadorPagamento
{
    public function pix(string $dadosPedido, string $dadosUsuario): String
    {
        return "dados do pagamento com pix na Pagarme";
    }

    public function boleto(string $dadosPedido, string $dadosUsuario): String
    {
        return "dados do pagamento com boleto na Pagarme";
    }

    public function credito(string $dadosPedido, string $dadosUsuario): String
    {
        return "dados do pagamento com credito na Pagarme";
    }
}