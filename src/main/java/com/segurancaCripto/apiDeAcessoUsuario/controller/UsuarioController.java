package com.segurancaCripto.apiDeAcessoUsuario.controller;

import com.segurancaCripto.apiDeAcessoUsuario.dto.UsuarioRequestDto;
import com.segurancaCripto.apiDeAcessoUsuario.dto.UsuarioResponseDto;
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

    @PostMapping(value = "/usuarios/create")
    public ResponseEntity<UsuarioResponseDto> cadastrarUsuario(@RequestBody UsuarioRequestDto usuarioRequestDto){
       return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.cadastrarUsuarios(usuarioRequestDto));
    }


    @GetMapping(value = "/usuarios")
    public ResponseEntity<List<UsuarioResponseDto>> buscarUsuariosCadastrados(){
        return ResponseEntity.ok(usuarioService.buscarTodosOsUsuariosCadastrados());
    }


}
