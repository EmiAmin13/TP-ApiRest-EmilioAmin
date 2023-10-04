package com.utn.TpApiRestEmilioAmin.Repositorios;

import com.utn.TpApiRestEmilioAmin.Entidades.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
}
