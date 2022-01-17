package com.backend.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class Controller {

    ICityService cityService;

    @Autowired
    public Controller(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getAll")
    public List<City> getAll(){

        return cityService.getAll();

    }
}
