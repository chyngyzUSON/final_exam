package kg.covidstat.covidstat.repository;

import kg.covidstat.covidstat.entity.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsRepo extends JpaRepository<Logs, Long> {
}
