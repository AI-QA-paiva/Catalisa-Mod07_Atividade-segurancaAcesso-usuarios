package com.segurancaCripto.apiDeAcessoUsuario.dto;

import com.segurancaCripto.apiDeAcessoUsuario.model.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class UsuarioResponseDto implements Serializable {
    private String nome;
    private String login;
    private String senha;

public UsuarioResponseDto(UsuarioModel objeto){
    nome = objeto.getNome();
    login = objeto.getLogin();
    senha = objeto.getSenha();
}


}
