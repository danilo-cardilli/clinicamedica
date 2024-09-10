# Enviando dados para a API

vamos mapiar os dados que vai ser enviado via POST para a API

> http://localhost:8080/medicos 

Vamos usar o Json para criar uma requisição.

> {

    "nome" : "Marta da Silva",
    "email" : "marta.silva@voll.med",
    "crm" : "355499",
    "especialidade" : "ORTOPEDIA",
    "endereco" : {
        "logradouro" : "rua 1",
        "bairro" : "bairro",
        "cep" : "12322699",
        "cidade" : "Sao Paulo",
        "uf" : "SP",
        "numero" : "2",
        "complemento" : "complemento"
    }
> }

Agora para enviar utilize o *Send*