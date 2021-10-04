package edu.pucmm.practica2webadvanced.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class HTTPResponse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idResponse;

    @OneToOne(cascade = CascadeType.ALL)
    private HTTPStatusCode statusCode;
    @OneToOne(cascade = CascadeType.ALL)
    private Charset charset;
    @OneToOne(cascade = CascadeType.ALL)
    private ResponseContentType responseContentType;

    @Column(nullable = false, columnDefinition = "get")
    private String accessMethod;

    @Column(nullable = false)
    private String httpHeaders;

    @Column(nullable = false)
    private String responseBody;

    public HTTPResponse() {
    }

    public HTTPResponse(HTTPStatusCode statusCode, Charset charset, ResponseContentType responseContentType, String accessMethod, String httpHeaders, String responseBody) {
        this.statusCode = statusCode;
        this.charset = charset;
        this.responseContentType = responseContentType;
        this.accessMethod = accessMethod;
        this.httpHeaders = httpHeaders;
        this.responseBody = responseBody;
    }
}
