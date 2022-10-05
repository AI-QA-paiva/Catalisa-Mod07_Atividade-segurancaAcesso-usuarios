package com.segurancaCripto.apiDeAcessoUsuario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class UsuarioResponseDto {
    private String nome;
    private String login;
    private String senha;
}
