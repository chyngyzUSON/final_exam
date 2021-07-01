package kg.covidstat.covidstat.service;

import kg.covidstat.covidstat.entity.Citizen;

import java.util.List;

public interface CitizenService {
    Citizen save(Citizen citizen);
    Citizen update(Citizen citizen);
    Citizen findById(Long id);
    List<Citizen> getAllCitizen();
}
