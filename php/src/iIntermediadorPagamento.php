<?php

namespace Factory\Php;

interface iIntermediadorPagamento
{
    public function pix(String $dadosPedido, String $dadosUsuario): String;
    public function boleto(String $dadosPedido, String $dadosUsuario): String;
    public function credito(String $dadosPedido, String $dadosUsuario): String;
}