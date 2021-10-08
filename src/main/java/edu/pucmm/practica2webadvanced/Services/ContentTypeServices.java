package edu.pucmm.practica2webadvanced.Services;

import edu.pucmm.practica2webadvanced.Models.ContentType;
import edu.pucmm.practica2webadvanced.Repositories.ContentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ContentTypeServices {

    @Autowired
    ContentTypeRepository contentTypeRepository;

    public ContentType insert(ContentType c){
        contentTypeRepository.save(c);
        return c;
    }
}
