package com.example.medicaux_service.services;

import com.example.medicaux_service.Entite.ServiceMedicale;

import java.util.List;

public interface IServiceMedicaleService {
    ServiceMedicale addFoyer(ServiceMedicale serviceMedicale);
    ServiceMedicale getById (long idService) throws Exception;
    List<ServiceMedicale> retrieveAllServices();
    ServiceMedicale updateServiceMedicale (ServiceMedicale serviceMedicale) throws Exception;
}
