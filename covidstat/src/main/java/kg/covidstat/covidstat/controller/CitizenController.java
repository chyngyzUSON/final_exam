package kg.covidstat.covidstat.controller;

import kg.covidstat.covidstat.entity.Citizen;
import kg.covidstat.covidstat.payload.CitizenModel;
import kg.covidstat.covidstat.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @GetMapping
    public List<Citizen> getAllCitizen(){
        return citizenService.getAllCitizen();
    }

    @GetMapping("/citizen/{id}")
    public Citizen findById(@PathVariable Long id){
        return citizenService.findById(id);
    }

    @PostMapping
    public Citizen save (@RequestBody Citizen citizen){
        return citizenService.save(citizen);
    }
}
