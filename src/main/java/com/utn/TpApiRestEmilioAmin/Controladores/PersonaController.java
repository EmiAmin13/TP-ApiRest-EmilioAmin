package com.utn.TpApiRestEmilioAmin.Controladores;

import com.utn.TpApiRestEmilioAmin.Entidades.Persona;
import com.utn.TpApiRestEmilioAmin.Servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}


