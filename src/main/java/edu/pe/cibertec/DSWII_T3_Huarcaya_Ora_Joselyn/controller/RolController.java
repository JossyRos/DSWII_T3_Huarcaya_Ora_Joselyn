package edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.controller;

import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.model.bd.Rol;
import edu.pe.cibertec.DSWII_T3_Huarcaya_Ora_Joselyn.service.RolService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/rol")
public class RolController {
    private RolService rolService;

    @GetMapping("lista")
    public ResponseEntity<List<Rol>> listarRol() {
        List<Rol> rolList = new ArrayList<>(rolService.listarRol());
        if (rolList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(rolList, HttpStatus.OK);
    }

    @PostMapping("registrar")
    public ResponseEntity<Rol> registrarRol(@RequestBody Rol rol) {
        return new ResponseEntity<>(rolService.guardarRol(rol), HttpStatus.CREATED);
    }
}
