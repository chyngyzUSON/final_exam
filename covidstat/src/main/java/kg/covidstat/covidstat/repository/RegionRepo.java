package kg.covidstat.covidstat.repository;

import kg.covidstat.covidstat.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepo extends JpaRepository<Region, Long> {
}
