package kg.covidstat.covidstat.service;

import kg.covidstat.covidstat.entity.Region;

import java.util.List;

public interface RegionService {
    Region save(Region region);
    Region getById(Long id);
    List<Region> getAllRegions();
}
