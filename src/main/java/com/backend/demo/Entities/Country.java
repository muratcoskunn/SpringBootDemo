package com.backend.demo.Entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="country")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cities"})
public class Country  {
    @Id
    @Column(name="countrycode")
    private String countryCode;

    @Column(name="Name")
    private String name;


    @Column(name="Continent")
    private String continent;

    @Column(name="Region")
    private String region;

    @OneToMany(mappedBy = "country")
    private List<City> cities;

}
