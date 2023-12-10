package com.example.medicaux_service.services;

import com.example.medicaux_service.Entite.ServiceMedicale;
import com.example.medicaux_service.Repository.IServiceMedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceMedicaleServices implements IServiceMedicaleService{
private final IServiceMedicoRepository serviceMedicoRepository;

    @Override
    public ServiceMedicale addFoyer(ServiceMedicale serviceMedicale) {
        return serviceMedicoRepository.save(serviceMedicale);
    }
}
