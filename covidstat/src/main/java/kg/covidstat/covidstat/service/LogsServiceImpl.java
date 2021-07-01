package kg.covidstat.covidstat.service;

import kg.covidstat.covidstat.entity.Citizen;
import kg.covidstat.covidstat.entity.Logs;
import kg.covidstat.covidstat.payload.LogsModel;
import kg.covidstat.covidstat.repository.CitizenRepo;
import kg.covidstat.covidstat.repository.LogsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class LogsServiceImpl implements LogsService {
    @Autowired
    private LogsRepo logsRepo;
    @Autowired
    private CitizenService citizenService;
    @Autowired
    private CitizenRepo citizenRepo;

    @Override
    public Logs save(LogsModel logsModel) {
        Citizen citizen = citizenService.findById(logsModel.getCitizenId());

        Logs logs = Logs.builder()
                .citizen(new Citizen())
                .infected(logsModel.isInfected())
                .vaccinated(logsModel.isVaccinated())
                .recordingDate(logsModel.getRecordingDate())
                .build();
        return logsRepo.save(logs);
    }

    @Override
    public Logs findById(Long id) {
        return logsRepo.findById(id).orElse(null);
    }


    @Override
    public List<Logs> getAllLogs() {
        return logsRepo.findAll();
    }


    @Override
    public List<Logs> getInfectedCitizensAllRegionsByDate(Date date) {
        List<Logs> listOfInfected = logsRepo.findAll()
        return null;
    }

    @Override
    public List<Logs> getVaccinatedCitizensAllRegionsByDate(Date date) {
        List<Logs> logsList = getAllLogs();

        return null;
    }
}
