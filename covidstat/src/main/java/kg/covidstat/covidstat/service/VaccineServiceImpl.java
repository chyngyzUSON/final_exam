package kg.covidstat.covidstat.service;

import kg.covidstat.covidstat.entity.Vaccine;
import kg.covidstat.covidstat.repository.VaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VaccineServiceImpl implements VaccineService {
    @Autowired
    private VaccineRepo vaccineRepo;

    @Override
    public Vaccine save(Vaccine vaccine) {
        return vaccineRepo.save(vaccine);
    }

    @Override
    public Vaccine getVaccineById(Long id) {
        return vaccineRepo.findById(id).orElse(null);
    }

    @Override
    public List<Vaccine> getAll() {
        return vaccineRepo.findAll();
    }
}
