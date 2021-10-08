package edu.pucmm.practica2webadvanced.Services;

import edu.pucmm.practica2webadvanced.Models.Mock;
import edu.pucmm.practica2webadvanced.Repositories.MockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
public class MockServices {
    @Autowired
    private MockRepository mockRepository;

    @Transactional()
    public Mock insert(Mock h){
        mockRepository.save(h);
        return h;
    }
}
