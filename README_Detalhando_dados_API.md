# Detalhando dados na API

Atualização da classe **MedicoController**

Implementação do metodo **detalhar** :
````
@GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var medico = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoMedico(medico));
    }
````