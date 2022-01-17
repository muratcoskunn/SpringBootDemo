package com.backend.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CityManager implements ICityService{
    ICityDal cityDal;
    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    public List<City> getAll(){
        return cityDal.findAll();

    }
}
