package com.utn.TpApiRestEmilioAmin.Entidades;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.io.Serializable;
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseEntidad implements Serializable {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
}
