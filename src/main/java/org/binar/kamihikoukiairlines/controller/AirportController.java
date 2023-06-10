package org.binar.kamihikoukiairlines.controller;

import org.binar.kamihikoukiairlines.model.Airport;
import org.binar.kamihikoukiairlines.service.AircraftService;
import org.binar.kamihikoukiairlines.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airport")
public class AirportController {
    @Autowired
    AirportService airportService;

    @GetMapping("/getAllAirport")
    public ResponseEntity<?> getAllAirport(){
        List<Airport> aircraftServices = airportService.getAllAirport();
        return ResponseEntity.ok(aircraftServices);
    }

    @PostMapping("/addAirport")
    public ResponseEntity<?> addAirport(@RequestBody Airport airport){
        Airport addAirport = airportService.addAirport(airport);
        return new ResponseEntity<>(addAirport, HttpStatus.CREATED);
    }

    @PutMapping("/updateAirport")
    public ResponseEntity<?> updateFilm(@RequestParam(name = "airportId") Long id, @RequestBody Airport airport){
        airportService.updateAirport(id, airport);
        return new ResponseEntity<>("Data berhasil diupdate", HttpStatus.OK);
    }
}
