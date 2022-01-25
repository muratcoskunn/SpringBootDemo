package com.backend.demo.Business.Abstract;

import com.backend.demo.Entities.Country;

import java.util.List;

public interface ICountryService {
    List<Country> getAll();
}
