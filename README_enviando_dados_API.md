# Enviando dados para a API

## Criar um projeto 
Usando o Postman para configurar as requisições.
Home -> Workspaces -> Create Workspace -> API  development -> Next 
ClinicaMedica -> Only me -> Create -> Collections -> Create new Collections -> requisições -> Add Request -> Renomear para requisições


vamos mapiar os dados que vai ser enviado via POST para a API

> http://localhost:8080/medicos 

Vamos usar o Json para criar uma requisição.
Para colocar o codigo em Json no POSTMAN. Clique em Body -> raw -> Json 

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