package com.example.medicaux_service.Controller;

import com.example.medicaux_service.Entite.ServiceMedicale;
import com.example.medicaux_service.services.ServiceMedicaleServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceMedicale")
@RequiredArgsConstructor
public class ServiceMedicaleController {

    private final ServiceMedicaleServices medicaleServices;

    public ResponseEntity<?> ajouterService(@RequestBody ServiceMedicale serviceMedicale){
        try {
            return new ResponseEntity<>(medicaleServices.addFoyer(serviceMedicale), HttpStatus.CREATED);
        }
        catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
