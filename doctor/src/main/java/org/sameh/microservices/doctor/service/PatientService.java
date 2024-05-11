package org.sameh.microservices.doctor.service;

public interface PatientService {
    public String getPatient(String name);
    public String getPatientByFeignClient(String name);
}
