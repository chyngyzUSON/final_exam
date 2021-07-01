package kg.covidstat.covidstat.controller;

import kg.covidstat.covidstat.entity.Vaccine;
import kg.covidstat.covidstat.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class VaccineController {
    @Autowired
    private VaccineService vaccineService;

    @GetMapping
    public List<Vaccine> getAll(){
        return vaccineService.getAll();
    }

    @GetMapping("/vaccine/{id}")
    public Vaccine getVaccineById(@PathVariable Long id){
        return vaccineService.getVaccineById(id);
    }

    @PostMapping
    public Vaccine save(@RequestBody Vaccine vaccine){
        return vaccineService.save(vaccine);
    }
}
