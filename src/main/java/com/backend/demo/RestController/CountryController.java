package com.backend.demo.RestController;

import com.backend.demo.Business.Abstract.ICountryService;
import com.backend.demo.Entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    ICountryService countryService;
    @Autowired
    public CountryController(ICountryService countryService) {
        this.countryService = countryService;
    }



    @GetMapping("/getAll")
    List<Country> getAll(){
        return countryService.getAll();
    }



}
