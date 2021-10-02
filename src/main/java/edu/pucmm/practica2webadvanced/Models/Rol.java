package edu.pucmm.practica2webadvanced.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Rol {
    @Id
    private String role;

    public Rol() {

    }
}
