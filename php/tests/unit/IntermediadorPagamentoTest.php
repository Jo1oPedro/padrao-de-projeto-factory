<?php

namespace Factory\Test;


use Factory\Php\IntermediadorPagamentoFactory;
use Factory\Php\PagarMe;
use PHPUnit\Framework\TestCase;

class IntermediadorPagamentoTest extends TestCase
{
    public function testDeveRetornarIntermediadorPagamentoInexistente(): void
    {
        $this->expectException(\InvalidArgumentException::class);
        $intermediadorPagamento = new IntermediadorPagamentoFactory("PagSeguro");
    }

    public function testDeveRetornarIntermediadorPagamentoInvalido(): void
    {
        $this->expectException(\RuntimeException::class);
        $intermediadorPagamento = new IntermediadorPagamentoFactory("OrendaPay");
    }

    public function testDeveRetornarIntermediadorPagamentoComSucesso()
    {
        $intermediadorPagamento = (new IntermediadorPagamentoFactory("PagarMe"))->recuperaIntermediador();
        $this->assertInstanceOf(PagarMe::class, $intermediadorPagamento);
    }
}