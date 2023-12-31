package com.example.medicaux_service.services;

import com.example.medicaux_service.Entite.ServiceMedicale;
import com.example.medicaux_service.Repository.IServiceMedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceMedicaleServices implements IServiceMedicaleService{
private final IServiceMedicoRepository serviceMedicoRepository;

    @Override
    public ServiceMedicale addFoyer(ServiceMedicale serviceMedicale) {
        return serviceMedicoRepository.save(serviceMedicale);
    }

    @Override
    public ServiceMedicale getById(long idService) throws Exception {
        ServiceMedicale ServiceById = serviceMedicoRepository.findById(idService)
                .orElseThrow(() -> new Exception("foyer introuvable avec l'id : " + idService));
        return ServiceById;
    }

    @Override
    public List<ServiceMedicale> retrieveAllServices() {
        List<ServiceMedicale> Services = (List<ServiceMedicale>) serviceMedicoRepository.findAll();
        return Services;
    }

    @Override
    public void removeService(long idService) throws Exception {
        Optional<ServiceMedicale> ServiceToDeletedExisting = serviceMedicoRepository.findById(idService);
        if (ServiceToDeletedExisting.isPresent()) {
            serviceMedicoRepository.deleteById(idService);
        } else {
            throw new Exception("foyer non trouve avec id " + idService);
        }
    }


    @Override
    public ServiceMedicale updateServiceMedicale(ServiceMedicale serviceMedicale) throws Exception {
        Optional<ServiceMedicale> isHere = serviceMedicoRepository.findById(serviceMedicale.getIdServiceMedicale());
        if (isHere.isPresent()) {
            ServiceMedicale ServiceIsExisting = isHere.get();
            ServiceIsExisting.setNomService(serviceMedicale.getNomService());
            ServiceIsExisting.setTarifs(serviceMedicale.getTarifs());
            ServiceIsExisting.setHoraires_ouverture(serviceMedicale.getHoraires_ouverture());

            return ServiceIsExisting;
        } else {
            throw new Exception("pas de bloc avec cet id : " + serviceMedicale.getIdServiceMedicale());
        }
    }
}
