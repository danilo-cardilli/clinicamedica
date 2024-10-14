# Adicionando o Spring Security
Adicone a dependecia: 
- Spring Security do maven
````
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    
    <dependency>
      <groupId>org.springframework.security</groupId>
      <artifactId>spring-security-test</artifactId>
      <scope>test</scope>
    </dependency>
````
Essas dependencias foi extraida do site: https://start.spring.io/
E apos de selecionar a dependencias e clicar o botão **EXPLORE**

- Executando o projeto mostra uma senha no terminal.

Agora abre o navegador e digite: http://localhost:8080/medicos pois é o mesma url que foi usado no postman e não funcionou ( e estava funcionando)
apareceu uma tela de login.
O login padrão:
- login: user
- senha: é a senha gerada no terminal