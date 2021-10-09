package edu.pucmm.practica2webadvanced;

import edu.pucmm.practica2webadvanced.Repositories.UserRepository;
import edu.pucmm.practica2webadvanced.Services.DBData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Practica2WebAdvancedApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Practica2WebAdvancedApplication.class, args);
        ApplicationContext applicationContext = SpringApplication.run(Practica2WebAdvancedApplication.class, args);


//        String[] lista = applicationContext.getBeanDefinitionNames();
//        System.out.println("====== Beans Registrados =====");
//        for(String bean : lista){
//            System.out.println(""+bean);
//        }
//        System.out.println("====== FIN Beans Registrados =====");

        UserRepository userRepository = (UserRepository) applicationContext.getBean("userRepository");
        if(userRepository.findAll().isEmpty()) {
            DBData dbData = (DBData) applicationContext.getBean("DBData");
            dbData.initDB();
        }
    }

}
