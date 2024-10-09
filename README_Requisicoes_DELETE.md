# Requisições DELETE

Passar o dados pela url pelo postman para efetuar a exclusão:
````
http://localhost:8080/medicos/27
````
Codigo da exclusão fisica
````
@DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
````

Codigo da exclusão logica
````
````