package com.utn.TpApiRestEmilioAmin.Repositorios;

import com.utn.TpApiRestEmilioAmin.Entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
