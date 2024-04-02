package ru.timofeev.aitestgeneration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "request")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "request_title")
    private String requestTitle;

    @Column(name = "request_response")
    private String requestResponse;

    @ManyToOne
    @JoinColumn(name = "request_type",
        foreignKey = @ForeignKey(name = "FK_REQUESTS_TYPE"))
    private RequestType requestType;
}
