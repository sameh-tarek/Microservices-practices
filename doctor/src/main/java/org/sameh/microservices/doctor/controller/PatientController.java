package org.sameh.microservices.doctor.controller;

import lombok.RequiredArgsConstructor;
import org.sameh.microservices.doctor.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/doctors/patients")
    public String getPatient(@RequestParam String name) {
        return patientService.getPatient(name);
    }
}
