package edu.pucmm.practica2webadvanced.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class HTTPStatusCode implements Serializable {
    @Id
    private int code;
    private String description;

    public HTTPStatusCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public HTTPStatusCode() {

    }
}
