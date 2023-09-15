<?php

namespace Factory\Test;

use Factory\Php\MercadoPago;
use PHPUnit\Framework\TestCase;

class MercadoPagoTest extends TestCase
{
    private ?MercadoPago $mercadoPago = null;

    /**
     * @before
     */
    public function setUp(): void {
        $this->mercadoPago = new MercadoPago();
    }

    public function testDeveRealizarPedidoPixComSucesso()
    {
        $response = $this->mercadoPago->pix("dados do pedido", "dados do usuario");
        $this->assertEquals("dados do pagamento com pix no Mercado Pago", $response);
    }

    public function testDeveRealizarPedidoBoletoComSucesso()
    {
        $response = $this->mercadoPago->boleto("dados do pedido", "dados do usuario");
        $this->assertEquals("dados do pagamento com boleto no Mercado Pago", $response);
    }

    public function testDeveRealizarPedidoCreditoComSucesso()
    {
        $response = $this->mercadoPago->credito("dados do pedido", "dados do usuario");
        $this->assertEquals("dados do pagamento com credito no Mercado Pago", $response);
    }
}