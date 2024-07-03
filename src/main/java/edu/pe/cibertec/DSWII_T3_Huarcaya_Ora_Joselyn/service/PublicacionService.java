package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.service;

import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.bd.Publicacion;
import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.dto.PublicacionDto;
import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.repository.PublicacionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublicacionService implements IPublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<PublicacionDto> obtenerPublicacionesDto() {
            List<Publicacion> publicaciones = publicacionRepository.findAll();
            return publicaciones.stream()
                    .map(this::convertirADto)
                    .collect(Collectors.toList());
        }

        private PublicacionDto convertirADto(Publicacion publicacion) {
            return modelMapper.map(publicacion, PublicacionDTO.class);
        }
}
