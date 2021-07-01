package kg.covidstat.covidstat.service;

import kg.covidstat.covidstat.entity.Vaccine;

import java.util.List;

public interface VaccineService {
    Vaccine save(Vaccine vaccine);
    Vaccine getVaccineById(Long id);
    List<Vaccine> getAll();
}
