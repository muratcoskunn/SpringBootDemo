package com.backend.demo.Dal;

import com.backend.demo.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryDal extends JpaRepository<Country,String> {
}
