<?php

namespace Factory\Test;

use Factory\Php\PagarMe;
use PHPUnit\Framework\TestCase;

class PagarMeTest extends TestCase
{
    private ?PagarMe $pagarMe = null;

    /**
     * @before
     */
    public function setUp(): void
    {
        $this->pagarMe = new PagarMe();
    }

    public function testDeveRealizarPedidoPixComSucesso()
    {
        $response = $this->pagarMe->pix("dados do pedido", "dados do usuario");
        $this->assertEquals("dados do pagamento com pix na Pagarme", $response);
    }

    public function testDeveRealizarPedidoBoletoComSucesso()
    {
        $response = $this->pagarMe->boleto("dados do pedido", "dados do usuario");
        $this->assertEquals("dados do pagamento com boleto na Pagarme", $response);
    }

    public function testDeveRealizarPedidoCreditoComSucesso()
    {
        $response = $this->pagarMe->credito("dados do pedido", "dados do usuario");
        $this->assertEquals("dados do pagamento com credito na Pagarme", $response);
    }
}