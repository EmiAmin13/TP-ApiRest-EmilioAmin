package com.utn.TpApiRestEmilioAmin.Servicios;

import com.utn.TpApiRestEmilioAmin.Entidades.Autor;
import com.utn.TpApiRestEmilioAmin.Repositorios.AutorRepository;
import com.utn.TpApiRestEmilioAmin.Repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
