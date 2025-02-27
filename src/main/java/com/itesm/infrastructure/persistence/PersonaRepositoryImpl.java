package com.itesm.infrastructure.persistence;

import com.itesm.domain.Persona;
import com.itesm.domain.repository.PersonaRepository;
import com.itesm.infrastructure.persistence.mapper.PersonaMapper;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PersonaRepositoryImpl implements PersonaRepository, PanacheRepositoryBase<PersonaEntity,Integer> {

    @Override
    public List<Persona> findAllPersonas() {
        List<Persona> personasList = new ArrayList<>();
        List<PersonaEntity> personasEntityList = listAll();
        personasEntityList.forEach(personaEntity -> {
            personasList.add(PersonaMapper.toDomain(personaEntity));
        });
        return personasList;
    }

    @Override
    @Transactional
    public Persona savePersona(Persona persona) {
        PersonaEntity personaEntity = PersonaMapper.toEntity(persona);
        persist(personaEntity);
        return persona;
    }
}
