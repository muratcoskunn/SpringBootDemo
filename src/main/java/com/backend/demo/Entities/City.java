package com.backend.demo.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="city")
@AllArgsConstructor
@NoArgsConstructor
public class City  {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="District")
    private String district;

    @Column(name="Population")
    private long population;

    @ManyToOne()
    @JoinColumn(name="countrycode")
    private Country country;
}
