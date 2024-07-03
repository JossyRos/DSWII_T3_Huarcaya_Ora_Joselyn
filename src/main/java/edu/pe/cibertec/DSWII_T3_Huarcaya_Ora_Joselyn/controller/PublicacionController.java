package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.controller;

import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.dto.PublicacionDto;
import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.service.IPublicacionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pubs-dto")
public class PublicacionController {

    private IPublicacionService publicacionService;

    @GetMapping
    public ResponseEntity<List<PublicacionDto>> obtenerPublicacionesDTO() {
        List<PublicacionDto> publicacionesDTO = publicacionService.obtenerPublicacionesDto();
        return ResponseEntity.ok(publicacionesDTO);
    }
}