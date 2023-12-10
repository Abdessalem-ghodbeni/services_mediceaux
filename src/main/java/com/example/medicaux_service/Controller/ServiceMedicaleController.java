package com.example.medicaux_service.Controller;

import com.example.medicaux_service.Entite.ServiceMedicale;
import com.example.medicaux_service.services.ServiceMedicaleServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/serviceMedicale")
@RequiredArgsConstructor
public class ServiceMedicaleController {

    private final ServiceMedicaleServices medicaleServices;
@PostMapping(path = "/add")
    public ResponseEntity<?> ajouterService(@RequestBody ServiceMedicale serviceMedicale){
        try {
            return new ResponseEntity<>(medicaleServices.addFoyer(serviceMedicale), HttpStatus.CREATED);
        }
        catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path = "/edit")
    public ResponseEntity<?> ModifierBloc(@RequestBody ServiceMedicale serviceMedicale) {
        try {
            ServiceMedicale blocUpdating = medicaleServices.updateServiceMedicale(serviceMedicale);
            return new ResponseEntity<>(blocUpdating, HttpStatus.OK);
        }

          catch (Exception e) {
              return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}
