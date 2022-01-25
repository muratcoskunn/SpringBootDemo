package com.backend.demo.Business.Concrete;

import com.backend.demo.Business.Abstract.ICountryService;
import com.backend.demo.Dal.ICountryDal;
import com.backend.demo.Entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryManager implements ICountryService {
    ICountryDal countryDal;
    @Autowired
    public CountryManager(ICountryDal countryDal) {
        this.countryDal = countryDal;
    }



    @Override
    public List<Country> getAll() {
        return countryDal.findAll();
    }
}
