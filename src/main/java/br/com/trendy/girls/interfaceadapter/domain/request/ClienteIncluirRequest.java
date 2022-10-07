package br.com.trendy.girls.interfaceadapter.domain.request;

import br.com.trendy.girls.interfaceadapter.enums.SexoEnums;
import br.com.trendy.girls.interfaceadapter.util.bean.Cpf;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteIncluirRequest implements Serializable {

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Size(max = 200)
    private String sobreNome;

    @Cpf
    @NotBlank
    private String cpf;

    @NotNull
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dataNascimento;

    @NotBlank
    @Pattern(regexp = "(\\d{2})-\\d{5}-\\d{4}$")
    private String telefone;

    @NotNull
    private SexoEnums sexo;
}