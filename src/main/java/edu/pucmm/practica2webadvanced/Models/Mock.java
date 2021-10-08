package edu.pucmm.practica2webadvanced.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Mock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idResponse;

    @OneToOne(cascade = CascadeType.ALL) @Column(nullable = false)
    private HTTPStatusCode statusCode;
    @OneToOne(cascade = CascadeType.ALL) @Column(nullable = false)
    private Charset charset;
    @OneToOne(cascade = CascadeType.ALL) @Column(nullable = false)
    private ContentType contentType;
    @OneToOne(cascade = CascadeType.ALL) @Column(nullable = false)
    private AccessMethod accessMethod;

    @Column(nullable = false)
    private String httpHeaders;

    @Column(nullable = false)
    private String responseBody;

    @Column(nullable = false)
    private boolean deleted = false;

    public Mock() {
    }

    public Mock(HTTPStatusCode statusCode, Charset charset, ContentType contentType, AccessMethod accessMethod, String httpHeaders, String responseBody) {
        this.statusCode = statusCode;
        this.charset = charset;
        this.contentType = contentType;
        this.accessMethod = accessMethod;
        this.httpHeaders = httpHeaders;
        this.responseBody = responseBody;
    }
}
