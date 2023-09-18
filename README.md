## Como executar o projeto inicial
\* É necessário ter o _PHP 8.2+. Link para fazer a instalação: https://www.php.net/ <br>
\* É necessário ter o composer instalado. Link para fazer a instalação: https://getcomposer.org/ <br>
\* É necessário ter o xdebug instalado para executar o coverage dos testes. Para fazer a instalação dele, digite no terminal php -i e cole todo o conteudo exibido nesse site: https://xdebug.org/wizard. Após isso, baixe o .dll que o site recomendou, altere o nome para apenas "php_xdebug.dll" e jogue o arquivo para a pasta ext do seu php. <br>
\*Entre no php.ini, vá ao final do arquivo e insira 3 linhas de configuração: zend_extension = xdebug <br>
xdebug.cli_color = 2 <br>
xdebug.mode = coverage <br>

1. Abra o Terminal na Pasta do Projeto;
2. Instale as dependências necessárias: `composer install`;
3. Atualize as dependências: `composer update`;
4. Rode o comando `./vendor/bin/phpunit` para executar os testes e gerar o code coverage apartir das configurações no phpunit.xml;
5. Acesse o relatório sobre os testes e code coverage através do arquivo index.html no diretório coverage que foi gerado após executar os testes;

