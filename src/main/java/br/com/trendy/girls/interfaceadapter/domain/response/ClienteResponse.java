package br.com.trendy.girls.interfaceadapter.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse implements Serializable {

    private Long id;
    private String nome;
    private String sobreNome;
    private String cpf;
    private String dataNascimento;
    private String telefone;
}