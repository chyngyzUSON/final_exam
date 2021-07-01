package kg.covidstat.covidstat.controller;

import kg.covidstat.covidstat.entity.Region;
import kg.covidstat.covidstat.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class RegionController {
    @Autowired
    private RegionService regionService;

    @GetMapping
    List<Region> getAllRegions(){
        return regionService.getAllRegions();
    }

    @GetMapping("/region/{id}")
    public Region getById(@PathVariable Long id){
        return regionService.getById(id);
    }

    @PostMapping
    public Region save(@RequestBody Region region){
        return regionService.save(region);
    }
}
