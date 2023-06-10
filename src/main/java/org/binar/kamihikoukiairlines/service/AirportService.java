package org.binar.kamihikoukiairlines.service;

import org.binar.kamihikoukiairlines.model.Airport;
import org.binar.kamihikoukiairlines.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {
    @Autowired
    AirportRepository airportRepository;


    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }


    public List<Airport> getAllAirport() {
        return airportRepository.findAll();
    }

    public Airport addAirport(Airport airport){
        return airportRepository.save(airport);
    }

    public Airport updateAirport(Long id, Airport airport){
        Airport tempat = airportRepository.findById(id).get();
        tempat.setAirportCode(airport.getAirportCode());
        tempat.setAirportName(airport.getAirportName());
        tempat.setCityCode(airport.getCityCode());
        tempat.setCityName(airport.getCityName());
        tempat.setCountryCode(airport.getCountryCode());
        tempat.setCityName(airport.getCityName());
        return airportRepository.save(tempat);
    }
}
