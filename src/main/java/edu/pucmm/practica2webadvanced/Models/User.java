package edu.pucmm.practica2webadvanced.Models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class User implements Serializable {
    @Id
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean active = true;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Rol> roles;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<HTTPResponse> misMocks;

    public User(String username, String password, Set<Rol> roles) {
        this.username = username;
        this.password = password;//new BCryptPasswordEncoder.encode(password);
        this.roles = roles;
    }

    public User() {

    }
}
