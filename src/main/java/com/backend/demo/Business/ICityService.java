package com.backend.demo.Business;

import com.backend.demo.Entities.City;

import java.util.List;

public interface ICityService {
    public List<City> getAll();
    public List<City> getByName(String name);
    City findById(int id);
}
