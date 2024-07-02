package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.service;

import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.bd.Rol;

import java.util.List;

public interface IRolService {
    List<Rol> listarRol();
    Rol guardarRol(Rol rol);
}
