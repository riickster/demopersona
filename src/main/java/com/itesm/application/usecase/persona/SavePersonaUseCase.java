package com.itesm.application.usecase.persona;

import com.itesm.application.service.PersonaService;
import com.itesm.domain.Persona;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SavePersonaUseCase {

    private final PersonaService personaService;

    public SavePersonaUseCase(PersonaService personaService){
        this.personaService = personaService;
    }

    public Persona execute(Persona persona){
        personaService.savePersona(persona);
        System.out.println("Guardando persona caso de uso: " + persona.getNombre());
        return persona;
    }
}
