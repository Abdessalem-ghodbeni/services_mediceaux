package com.example.medicaux_service.Repository;

import com.example.medicaux_service.Entite.ServiceMedicale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServiceMedicoRepository extends JpaRepository<ServiceMedicale,Long> {
}
