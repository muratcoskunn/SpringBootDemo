package com.backend.demo.Dal;

import com.backend.demo.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICityDal extends JpaRepository<City,Integer> {
    @Query("Select c from City c where c.name=:name")
    List<City> getByName(@Param("name") String name);
    @Query("Select c from City c where c.id =:id")
    City findById(@Param("id")int id);
    List<City> getByCountry(String code);
}
