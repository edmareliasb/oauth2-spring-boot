# Exemplo oauth2-spring-security

## Tecnologias

<ul>
  <li>Spring Security</li>
  <li>Spring Boot</li>
  <li>OAuth 2</li>
</ul>

Após executar a aplicação:

Abrir o Postman para chamar o serviço de login.

Fazer a chamada para o serviço http://localhost:8080/oauth/token utilizando o método POST.

Na aba Autorization configurar da seguinte forma:

type: Basic Auth
Username: client
Password: clientpassword

Na aba Body configurar:

Marcar a opção x-www-form-urlencoded e atribuir os valores:

client_id: client
username: user
password: user
grant_type: password

Clicar em SEND.

Com o token validado chamar o serviço GET http://localhost:8080/produtos
passando no header:

Authorization: Bearer <access_token_gerado_no_servico_login>
