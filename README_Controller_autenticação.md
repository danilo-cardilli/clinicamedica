# Controller de autenticação

Uma boa pratica é usar algoritmo de hashing de senha.
- Usaremos o algoritmo BCrypt

Autenticação sem aplicar o algoritmo BCrypt 
````
{

   "login" : "jose.carlos@voll.med",
    "senha" : "123456"
    
}
````
Autenticação aplicando o algoritmo BCrypt 

-site usado:https://bcrypt-generator.com/ 

OBS: aplica insert no banco de dados ususarios

````

   login : "jose.carlos@voll.med",
    senha : "$2a$12$vNn324sLdpxTqVsembDhG.x3jD/VLhSRnRuElTvdPW.57gqFi0M9G"
    
````