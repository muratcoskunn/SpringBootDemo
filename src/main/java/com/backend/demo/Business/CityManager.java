package com.backend.demo.Business;

import com.backend.demo.Dal.ICityDal;
import com.backend.demo.Entities.City;
import com.backend.demo.Entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CityManager implements ICityService {
    ICityDal cityDal;
    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    public List<City> getAll(){
        return cityDal.findAll();

    }
    @Transactional
    @Override
    public List<City> getByName(String name) {
        return cityDal.getByName(name);
    }

    @Override
    @Transactional
    public City findById(int id) {
        return cityDal.findById(id);
    }

    @Override
    public List<City> getByCountry(String code) {
        return cityDal.getByCountryCountryCode(code);

    }

    @Override
    public List<City> getByCountryName(String name) {
        return cityDal.getByCountryName(name);
    }

    @Override
    public List<Country> getCountries() {
        return cityDal.getCountries();
    }
}
