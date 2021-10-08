package edu.pucmm.practica2webadvanced.Repositories;

import edu.pucmm.practica2webadvanced.Models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Rol, String> {

    List<Rol> findAll();

    List<Rol> findById(Rol a);
}
