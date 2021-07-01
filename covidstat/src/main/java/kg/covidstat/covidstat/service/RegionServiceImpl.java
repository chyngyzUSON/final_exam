package kg.covidstat.covidstat.service;

import kg.covidstat.covidstat.entity.Region;
import kg.covidstat.covidstat.repository.RegionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    private RegionRepo regionRepo;

    @Override
    public Region save(Region region) {
        return regionRepo.save(region);
    }

    @Override
    public Region getById(Long id) {
        return regionRepo.findById(id).orElse(null);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionRepo.findAll();
    }
}
