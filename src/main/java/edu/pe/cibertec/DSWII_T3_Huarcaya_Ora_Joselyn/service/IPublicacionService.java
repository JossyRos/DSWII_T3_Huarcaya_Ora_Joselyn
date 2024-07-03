package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.service;

import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.dto.PublicacionDto;

import java.util.List;

public interface IPublicacionService {
    List<PublicacionDto> obtenerPublicacionesDto();
}
