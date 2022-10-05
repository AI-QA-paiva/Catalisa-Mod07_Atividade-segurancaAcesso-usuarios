package com.segurancaCripto.apiDeAcessoUsuario.service;

import com.segurancaCripto.apiDeAcessoUsuario.model.UsuarioModel;
import com.segurancaCripto.apiDeAcessoUsuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioModel cadastrarUsuarios(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }

    public List<UsuarioModel> buscarTodosOsUsuariosCadastrados(){
        return usuarioRepository.findAll();
    }


}
