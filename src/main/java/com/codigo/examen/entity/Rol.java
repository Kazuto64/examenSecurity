package com.codigo.examen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "rol")
@Getter
@Setter
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(nullable = false, unique = true)
    private String nombreRol;

    private Set<Rol> role = new HashSet<>();
    List<SimpleGrantedAuthority> authorities = role.stream()
            .map(Rol::getNombreRol)
            .map(SimpleGrantedAuthority::new)
            .collect(Collectors.toList());
}