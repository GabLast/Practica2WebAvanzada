package edu.pucmm.practica2webadvanced.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class Mock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idResponse;
    @Column(columnDefinition = "varchar(255) default 'Default name'")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private HTTPStatusCode statusCode;
    @OneToOne(cascade = CascadeType.ALL)
    private Charset charset;
    @OneToOne(cascade = CascadeType.ALL)
    private ContentType contentType;
    @OneToOne(cascade = CascadeType.ALL)
    private AccessMethod accessMethod;

    @Column(nullable = false)
    private String httpHeaders;

    @Column(nullable = false)
    private String responseBody;

    private Date dateCreate = new Date();

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expirationDate;

    @Column(nullable = false)
    private boolean deleted = false;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    public Mock() {
    }

    public Mock(String name, HTTPStatusCode statusCode, Charset charset, ContentType contentType, AccessMethod accessMethod, String httpHeaders, String responseBody, Date expirationDate, User user) {
        this.name = name;
        this.statusCode = statusCode;
        this.charset = charset;
        this.contentType = contentType;
        this.accessMethod = accessMethod;
        this.httpHeaders = httpHeaders;
        this.responseBody = responseBody;
        this.expirationDate = expirationDate;
        this.user = user;
    }
}
