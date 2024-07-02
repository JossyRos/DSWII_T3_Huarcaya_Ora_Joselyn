package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.repository;

import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.bd.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Rol findByNomrol(String nomrol);
}
