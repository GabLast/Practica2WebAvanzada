package edu.pucmm.practica2webadvanced.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class ContentType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContentType;
    @Column(nullable = false)
    private String description;

    public ContentType() {
    }

    public ContentType(String description) {
        this.description = description;
    }
}
