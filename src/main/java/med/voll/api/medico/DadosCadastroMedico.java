package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank
        String nome,

        @Email
        String email,

        @NotNull
        Especialidade especialidade,

        @NotNull @Valid
        DadosEndereco endereco ) {
}
