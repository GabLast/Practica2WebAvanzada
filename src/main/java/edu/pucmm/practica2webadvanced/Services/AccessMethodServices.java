package edu.pucmm.practica2webadvanced.Services;

import edu.pucmm.practica2webadvanced.Models.AccessMethod;
import edu.pucmm.practica2webadvanced.Repositories.AccessMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
public class AccessMethodServices {

    @Autowired
    private AccessMethodRepository accessMethodRepository;

    @Transactional()
    public AccessMethod insert(AccessMethod accessMethod){
        accessMethodRepository.save(accessMethod);
        return accessMethod;
    }

}
