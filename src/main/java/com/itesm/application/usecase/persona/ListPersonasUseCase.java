package com.itesm.application.usecase.persona;

import com.itesm.application.service.PersonaService;
import com.itesm.domain.Persona;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ListPersonasUseCase {

    private final PersonaService personaService;

    public ListPersonasUseCase(PersonaService personaService){
        this.personaService = personaService;
    }

    public List<Persona> execute(){
        System.out.println("Listando personas caso de uso");
        return personaService.listPersonas();
    }
}
