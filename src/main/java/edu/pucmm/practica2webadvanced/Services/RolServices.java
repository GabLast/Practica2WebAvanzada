package edu.pucmm.practica2webadvanced.Services;
import edu.pucmm.practica2webadvanced.Models.Rol;
import edu.pucmm.practica2webadvanced.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
public class RolServices {

    @Autowired
    private RoleRepository repository;

    public Rol insert(Rol r){

        repository.save(r);
        return r;
    }

}
