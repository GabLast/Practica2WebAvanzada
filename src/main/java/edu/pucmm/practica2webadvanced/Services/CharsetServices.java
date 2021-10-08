package edu.pucmm.practica2webadvanced.Services;

import edu.pucmm.practica2webadvanced.Models.Charset;
import edu.pucmm.practica2webadvanced.Repositories.CharsetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
public class CharsetServices {

    @Autowired
    private CharsetRepository charsetRepository;

    @Transactional()
    public Charset insert(Charset charset){
        charsetRepository.save(charset);
        return charset;
    }
}
