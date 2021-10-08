package edu.pucmm.practica2webadvanced.Services;

import edu.pucmm.practica2webadvanced.Models.User;
import edu.pucmm.practica2webadvanced.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;


    @Transactional()
    public User insert(User u)
    {
        userRepository.save(u);
        return u;
    }
}
