package kg.covidstat.covidstat.service;

import kg.covidstat.covidstat.entity.Citizen;
import kg.covidstat.covidstat.repository.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitizenServiceImpl implements CitizenService {
    @Autowired
    private CitizenRepo citizenRepo;


    @Override
    public Citizen save(Citizen citizen) {
        return citizenRepo.save(citizen);
    }

    @Override
    public Citizen update(Citizen citizen) {
        return citizenRepo.save(citizen);
    }

    @Override
    public Citizen findById(Long id) {
        return citizenRepo.findById(id).orElse(null);
    }

    @Override
    public List<Citizen> getAllCitizen() {
        return null;
    }
}
