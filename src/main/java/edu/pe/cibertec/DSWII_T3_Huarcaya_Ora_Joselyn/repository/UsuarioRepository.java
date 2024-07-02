package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.repository;


import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository
        extends JpaRepository<Usuario, Integer> {
    Usuario findByNomusuario(String nomusuario);

    Usuario findByNombres(String nombres);

}
