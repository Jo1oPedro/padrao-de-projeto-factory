<?php

namespace Factory\Php;

interface iIntermediadorPagamento
{
    public function pix(String $dadosPedido, String $dadosUsuario);
    public function boleto(String $dadosPedido, String $dadosUsuario);
    public function credito(String $dadosPedido, String $dadosUsuario);
}