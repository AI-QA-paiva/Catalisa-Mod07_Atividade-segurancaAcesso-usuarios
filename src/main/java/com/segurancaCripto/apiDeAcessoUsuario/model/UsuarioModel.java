package com.segurancaCripto.apiDeAcessoUsuario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "usuarios")

public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
