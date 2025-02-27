package com.itesm.domain.repository;

import com.itesm.domain.Persona;

import java.util.List;

public interface PersonaRepository {
    List<Persona> findAllPersonas();
    Persona savePersona(Persona persona);
}
