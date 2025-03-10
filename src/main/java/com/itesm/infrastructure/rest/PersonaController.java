package com.itesm.infrastructure.rest;


import com.itesm.application.usecase.persona.ListPersonasUseCase;
import com.itesm.application.usecase.persona.SavePersonaUseCase;
import com.itesm.domain.Persona;
import jakarta.ws.rs.*;

import java.util.List;

@Path("/persona")
@Produces("application/json")
@Consumes("application/json")
public class PersonaController {

    private final ListPersonasUseCase listPersonasUseCase;
    private final SavePersonaUseCase savePersonaUseCase;
    public PersonaController(ListPersonasUseCase listPersonasUseCase, SavePersonaUseCase savePersonaUseCase){
        this.listPersonasUseCase = listPersonasUseCase;
        this.savePersonaUseCase = savePersonaUseCase;
    }

    @GET
    public List<Persona> findAll(){
        List<Persona> response=listPersonasUseCase.execute();
        return response;
    }

    @POST
    public Persona savePersona(Persona persona){
        return savePersonaUseCase.execute(persona);
    }


}
