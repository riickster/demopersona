package com.itesm.application.service;

import com.itesm.domain.Persona;
import com.itesm.domain.repository.PersonaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class PersonaService {


    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    public Persona savePersona(Persona persona){
        UUID uuid = UUID.randomUUID();
        persona.setUuid(uuid.toString());
        personaRepository.savePersona(persona);
        return persona;
    }

    public List<Persona> listPersonas(){
        System.out.println("Listando personas desde logica de negocio");
        return personaRepository.findAllPersonas();
    }

    public Persona getPersonaById(int id){
        System.out.println("Obteniendo persona por id desde logica de negocio: " + id);
        return null;
    }

}
