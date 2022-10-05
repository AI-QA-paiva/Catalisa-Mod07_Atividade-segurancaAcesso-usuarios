package com.segurancaCripto.apiDeAcessoUsuario.controller;

import com.segurancaCripto.apiDeAcessoUsuario.model.UsuarioModel;
import com.segurancaCripto.apiDeAcessoUsuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(path = "/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UsuarioModel> cadastrarUsuario(@RequestBody UsuarioModel usuarioModel){
        return ResponseEntity.ok().body(usuarioService.cadastrarUsuarios(usuarioModel));
    }

    @GetMapping(path = "/usuarios")
    public ResponseEntity<List<UsuarioModel>> buscarUsuariosCadastrados(){
        return ResponseEntity.ok().body(usuarioService.buscarTodosOsUsuariosCadastrados());
    }


}
