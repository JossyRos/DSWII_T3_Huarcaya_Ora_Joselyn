package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PublicacionDto {
    private String titulo;
    private String resumen;
    private LocalDate fechPublicacion;
    private String nomAutor;
    private String apeAutor;
}
