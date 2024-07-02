package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.service;

import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.bd.Usuario;
import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService{
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario ObtenerNomUsuario(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
