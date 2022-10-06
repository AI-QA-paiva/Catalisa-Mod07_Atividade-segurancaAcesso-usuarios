package com.segurancaCripto.apiDeAcessoUsuario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Validated
public class UsuarioRequestDto {

    @NotEmpty
    private String nome;

    @Column
    private Integer idade;

    @Column
    private String telefone;

    @NotEmpty
    private String login;

    @NotEmpty
    private String senha;


}
