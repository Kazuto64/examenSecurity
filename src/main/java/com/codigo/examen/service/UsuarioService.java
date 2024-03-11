package com.codigo.examen.service;

import com.codigo.examen.entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UsuarioService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    ResponseEntity<Usuario> createUsuario(Usuario usuario);
    ResponseEntity<Usuario> getUsuarioById(Long id);
    ResponseEntity<Usuario> updateUsuario(Long id, Usuario usuario);
    ResponseEntity<Usuario> deleteUsuario(Long id);
    UserDetailsService userDetailsService();
}
