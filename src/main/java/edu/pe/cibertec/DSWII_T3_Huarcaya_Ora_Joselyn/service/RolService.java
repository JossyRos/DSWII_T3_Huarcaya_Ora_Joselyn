package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.service;

import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.bd.Rol;
import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.repository.RolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service

public class RolService implements IRolService {
    private RolRepository rolRepository;

    @Override
    public List<Rol> listarRol() {
        return rolRepository.findAll();
    }

    @Override
    public Rol guardarRol(Rol rol) {
        return  rolRepository.save(rol);
    }
}
