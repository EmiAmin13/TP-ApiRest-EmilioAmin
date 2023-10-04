package com.utn.TpApiRestEmilioAmin.Servicios;

import com.utn.TpApiRestEmilioAmin.Entidades.Persona;
import com.utn.TpApiRestEmilioAmin.Repositorios.BaseRepository;
import com.utn.TpApiRestEmilioAmin.Repositorios.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
