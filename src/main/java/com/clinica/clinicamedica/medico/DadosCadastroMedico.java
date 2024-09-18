package com.clinica.clinicamedica.medico;

import com.clinica.clinicamedica.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
