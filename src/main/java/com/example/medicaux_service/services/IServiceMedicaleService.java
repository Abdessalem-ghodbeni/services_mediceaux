package com.example.medicaux_service.services;

import com.example.medicaux_service.Entite.ServiceMedicale;

public interface IServiceMedicaleService {
    ServiceMedicale addFoyer(ServiceMedicale serviceMedicale);
    ServiceMedicale updateServiceMedicale (ServiceMedicale serviceMedicale) throws Exception;
}
