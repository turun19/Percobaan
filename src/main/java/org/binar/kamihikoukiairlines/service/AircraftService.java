package org.binar.kamihikoukiairlines.service;

import org.binar.kamihikoukiairlines.model.Aircraft;
import org.binar.kamihikoukiairlines.model.Airport;
import org.binar.kamihikoukiairlines.repository.AircraftRepository;
import org.binar.kamihikoukiairlines.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {

    @Autowired
    AircraftRepository aircraftRepository;


    public AircraftService(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }


    public void getAllAircraft() {
        aircraftRepository.findAll();
    }

    public Aircraft addAircraft(Aircraft aircraft){
        return aircraftRepository.save(aircraft);
    }

    public Aircraft updateAircraft(Long id, Aircraft aircraft){
        Aircraft pesawat = aircraftRepository.findById(id).get();
        pesawat.setAircraftCode(aircraft.getAircraftCode());
        return aircraftRepository.save(pesawat);
    }
}
