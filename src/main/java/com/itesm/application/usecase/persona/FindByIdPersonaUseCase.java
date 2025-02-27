package com.itesm.application.usecase.persona;

import com.itesm.domain.Persona;

public class FindByIdPersonaUseCase {
    public Persona execute(String uuid) {
        System.out.println("Buscando persona por id caso de uso: " + uuid);
        return new Persona("Juan", "123", "juan@prueba.com");
    }
}
