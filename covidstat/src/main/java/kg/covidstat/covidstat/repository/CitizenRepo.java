package kg.covidstat.covidstat.repository;

import kg.covidstat.covidstat.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Long> {
}
