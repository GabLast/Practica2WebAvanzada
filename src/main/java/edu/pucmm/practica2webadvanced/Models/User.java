package edu.pucmm.practica2webadvanced.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {
    @Id
    private String username;
    private String password;
    @Column(nullable = false)
    private boolean active = true;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Rol> roles;

    public User(String username, String password, Set<Rol> roles) {
        this.username = username;
        this.password = password;//new BCryptPasswordEncoder.encode(password);
        this.roles = roles;
    }

    public User() {

    }
}
