# Validação com Bean Validation

Na classe MedicoController
Para fazer a validação vamos ate a classe que esta sendo recibido no metodo cadastrar
A classe **DadosCadastroMedico**
```
import com.clinica.clinicamedica.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(
@NotBlank
String nome,
@NotBlank
@Email
String email,
@NotBlank
@Pattern(regexp = "\\d{4,6}")
String crm,
@NotNull
Especialidade especialidade,
@NotNull @Valid DadosEndereco endereco) {
}
```

Fazer mesma coisa na classe **DadosEndereco**

```

package com.clinica.clinicamedica.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
@NotBlank
String logradouro,
@NotBlank
String bairro,
@NotBlank
@Pattern(regexp = "\\d{8}")
String cep,
@NotBlank
String cidade,
@NotBlank
String uf,
String complemento,
String numero) {
}

```
Vai até a classe **MedicoController**
E coloque uma notação no metodo cadastrar

```

package com.clinica.clinicamedica.controller;

import com.clinica.clinicamedica.domain.medico.DadosCadastroMedico;
import com.clinica.clinicamedica.domain.medico.Medico;
import com.clinica.clinicamedica.domain.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {

        repository.save(new Medico(dados));
    }

```


