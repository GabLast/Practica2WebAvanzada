package edu.pucmm.practica2webadvanced.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DBData {

    @Autowired
    private AccessMethodServices accessMethodServices;
    @Autowired
    private CharsetServices charsetServices;
    @Autowired
    private UserServices userServices;
    @Autowired
    private HTTPStatusCodeServices httpStatusCodeServices;
    @Autowired
    private ContentTypeServices contentTypeServices;
    @Autowired
    private RolServices rolServices;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @PostConstruct
    public void initDB()
    {

    }
}
