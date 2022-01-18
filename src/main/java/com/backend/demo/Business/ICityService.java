package com.backend.demo.Business;

import com.backend.demo.Entities.City;
import com.backend.demo.Entities.Country;

import java.util.List;

public interface ICityService {
    public List<City> getAll();
    public List<City> getByName(String name);
    City findById(int id);
    List<City> getByCountry(String code);

    List<City> getByCountryName(String name);

    List<Country> getCountries();
}
