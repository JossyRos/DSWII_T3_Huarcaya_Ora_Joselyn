package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioSeguDto {
    private Integer idusuario;
    private String nomusuario;
    private String token;
}
