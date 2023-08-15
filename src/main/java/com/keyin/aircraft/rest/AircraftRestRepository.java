package com.keyin.aircraft.rest;

import org.keyin.aircraft.Aircraft;
import org.keyin.airport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aircraft_repo", path = "aircraft_repo")
public interface AircraftRestRepository extends JpaRepository<Aircraft, Long> {

}
