# Nova migration

## Continua

Se esquecer de adcionar um dado volte para classe
Nesse caso vamos voltar para classe **DadosCadastroMedico** e colocar o atributo que falta, no caso telefone.

````
package com.clinica.clinicamedica.medico;

import com.clinica.clinicamedica.endereco.DadosEndereco;
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
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid DadosEndereco endereco) {
}
````

Também vamos mexer na JPA. Vamos para a classe **Medico**
Na classe Medico insira o atrituto **private String telefone;** 
e alteramos o metodo **Medico**

````
package com.clinica.clinicamedica.medico;

import com.clinica.clinicamedica.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}

````

Agora vamos criar a nova migrarion **V2__alter-table-medicos-add-column-telefone.sql**
proque falto o dado telefone e vamos atualizar os dados

````
{

    "nome" : "Ze da Silva",
    "email" : "zeilva@voll.med",
    "crm" : "665485",
    "telefone" : "66706",
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
}

````

