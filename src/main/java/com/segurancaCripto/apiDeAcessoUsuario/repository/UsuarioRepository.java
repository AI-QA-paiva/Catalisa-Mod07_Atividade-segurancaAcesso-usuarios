package com.segurancaCripto.apiDeAcessoUsuario.repository;

import com.segurancaCripto.apiDeAcessoUsuario.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
