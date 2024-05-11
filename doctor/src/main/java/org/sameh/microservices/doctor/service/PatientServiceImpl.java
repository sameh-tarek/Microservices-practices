package org.sameh.microservices.doctor.service;

import lombok.RequiredArgsConstructor;
import org.sameh.microservices.doctor.proxy.PatientProxy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    private final PatientProxy patientProxy;

    @Override
    public String getPatient(String name) {
        String fullUrl = "http://localhost:9000/search/" + name;
        RestTemplate restTemplate = new RestTemplate();
        String patientName = restTemplate.getForObject(fullUrl, String.class);
        return patientName;
    }

    @Override
    public String getPatientByFeignClient(String name) {
        return patientProxy.getPatientName(name);
    }


}
