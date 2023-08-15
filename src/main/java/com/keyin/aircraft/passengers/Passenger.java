package com.keyin.aircraft.passengers;

import org.keyin.aircraft.Aircraft;
import org.keyin.city.City;

import javax.persistence.*;
import java.util.List;

@Entity
public class Passenger {

    @Id
    @SequenceGenerator(name = "passenger_sequence", sequenceName = "passenger_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "passenger_sequence")

    private long id;

    @ManyToMany
    @JoinTable(
            name = "passenger_aircraft",
            joinColumns = @JoinColumn(name = "passenger_id"),
            inverseJoinColumns = @JoinColumn(name = "aircraft_id")
    )
    private List<Aircraft> aircraft;

    @OneToOne
    private City passCity;

    private String name;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }


    public City getPassCity() {
        return passCity;
    }

    public void setPassCity(City passCity) {
        this.passCity = passCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
