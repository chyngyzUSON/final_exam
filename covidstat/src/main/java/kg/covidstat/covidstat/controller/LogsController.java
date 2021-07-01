package kg.covidstat.covidstat.controller;

import kg.covidstat.covidstat.entity.Logs;
import kg.covidstat.covidstat.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping
public class LogsController {
    @Autowired
    private LogsService logsService;

    @GetMapping
    public List<Logs> getAllLogs(){
        return logsService.getAllLogs();
    }

    @GetMapping("/logs/{id}")
    public Logs findById(@PathVariable Long id){
        return logsService.findById(id);
    }

    @PostMapping("/logs/infected")
    public List<Logs> getInfectedCitizensAllRegionsByDate(@RequestBody Date date){
        return logsService.getInfectedCitizensAllRegionsByDate(date);
    }

    @PostMapping("/logs/vaccinated")
    public List<Logs> getVaccinatedCitizensAllRegionsByDate(@RequestBody Date date){
        return logsService.getVaccinatedCitizensAllRegionsByDate(date);
    }
}
