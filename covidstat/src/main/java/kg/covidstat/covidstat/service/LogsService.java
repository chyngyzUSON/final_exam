package kg.covidstat.covidstat.service;

import kg.covidstat.covidstat.entity.Logs;

import java.util.Date;
import java.util.List;

public interface LogsService {
    Logs save(Logs logs);
    Logs findById(Long id);
//    Logs update(Logs logs);
    List<Logs> getAllLogs();
    List<Logs> getInfectedCitizensAllRegionsByDate(Date date);
    List<Logs> getVaccinatedCitizensAllRegionsByDate(Date date);
//    List<Logs>
}
