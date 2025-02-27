package com.itesm.infrastructure.persistence.mapper;

import com.itesm.domain.Persona;
import com.itesm.infrastructure.persistence.PersonaEntity;

public class PersonaMapper {

    public static Persona toDomain(PersonaEntity personaEntity){
        return new Persona(personaEntity.getName(), personaEntity.getUuid(), personaEntity.getEmail());
    }

    public static PersonaEntity toEntity(Persona persona){
        return new PersonaEntity(persona.getNombre(), persona.getUuid(), persona.getEmail());
    }
}
