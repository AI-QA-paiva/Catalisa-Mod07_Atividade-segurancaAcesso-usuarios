package com.segurancaCripto.apiDeAcessoUsuario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class UsuarioRequestDto {

    @Column
    private String nome;

    @Column
    private Integer idade;

    @Column
    private String telefone;

    @Column
    private String login;

    @Column
    private String senha;


}
