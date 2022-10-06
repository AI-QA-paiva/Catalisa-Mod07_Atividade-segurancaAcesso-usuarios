package com.segurancaCripto.apiDeAcessoUsuario.service;

import com.segurancaCripto.apiDeAcessoUsuario.dto.UsuarioRequestDto;
import com.segurancaCripto.apiDeAcessoUsuario.dto.UsuarioResponseDto;
import com.segurancaCripto.apiDeAcessoUsuario.model.UsuarioModel;
import com.segurancaCripto.apiDeAcessoUsuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder gerarCripto() {
        return new BCryptPasswordEncoder();
    }

    public UsuarioResponseDto cadastrarUsuarios(UsuarioRequestDto usuarioRequestDto) {
        usuarioRequestDto.setSenha(gerarCripto().encode(usuarioRequestDto.getSenha()));
        UsuarioModel novoUsuario = new UsuarioModel(null, usuarioRequestDto.getNome(), usuarioRequestDto.getIdade(),
                usuarioRequestDto.getTelefone(), usuarioRequestDto.getLogin(), usuarioRequestDto.getSenha());
        usuarioRepository.save(novoUsuario);

        UsuarioResponseDto replicandoDados = new UsuarioResponseDto(novoUsuario.getNome(), novoUsuario.getLogin(), novoUsuario.getSenha());

        return replicandoDados;
    }

    public List<UsuarioResponseDto> buscarTodosOsUsuariosCadastrados() {
        List<UsuarioModel> buscaDeUsuarios = usuarioRepository.findAll();
        return buscaDeUsuarios.stream().map(devolve -> new UsuarioResponseDto(devolve.getNome(),
                devolve.getLogin(), devolve.getSenha())).collect(Collectors.toList());
    }

}
