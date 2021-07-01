package kg.covidstat.covidstat.repository;

import kg.covidstat.covidstat.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepo extends JpaRepository<Vaccine, Long> {
}
