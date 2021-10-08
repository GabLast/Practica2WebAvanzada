package edu.pucmm.practica2webadvanced.Repositories;


import edu.pucmm.practica2webadvanced.Models.Mock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MockRepository extends JpaRepository<Mock, Long> {
    List<Mock> findAllByDeletedNot(boolean deleted);

}