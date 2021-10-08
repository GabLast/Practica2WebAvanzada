package edu.pucmm.practica2webadvanced.Repositories;

import edu.pucmm.practica2webadvanced.Models.Charset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharsetRepository extends JpaRepository<Charset, Integer> {

    List<Charset> findAll();
}
