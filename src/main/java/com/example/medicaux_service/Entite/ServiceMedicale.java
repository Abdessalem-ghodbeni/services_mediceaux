package com.example.medicaux_service.Entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Bloc")
public class ServiceMedicale  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idService")
    private long idServiceMedicale;

    @Column(name = "nomService")
    private String nomService;

    @Column(name = "tarif")
    private long tarifs;

    @Temporal(TemporalType.DATE)
    private LocalDate horaires_ouverture;



}
