package com.utn.TpApiRestEmilioAmin.Repositorios;

import com.utn.TpApiRestEmilioAmin.Entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
