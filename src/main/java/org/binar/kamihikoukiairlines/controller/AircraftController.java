package org.binar.kamihikoukiairlines.controller;

import org.binar.kamihikoukiairlines.model.Aircraft;
import org.binar.kamihikoukiairlines.model.Airport;
import org.binar.kamihikoukiairlines.service.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/aircraft")
public class AircraftController {
    @Autowired
    AircraftService aircraftService;

    @GetMapping("/getAllAircraft")
    public ResponseEntity<?> getAllAircraft(){
        aircraftService.getAllAircraft();
        return ResponseEntity.ok("Data Airport");
    }

    @PostMapping("/addAirport")
    public ResponseEntity<?> addAirport(@RequestBody Aircraft aircraft){
        Aircraft addAircraft = aircraftService.addAircraft(aircraft);
        return new ResponseEntity<>(addAircraft, HttpStatus.CREATED);
    }

    @PutMapping("/updateAircraft")
    public ResponseEntity<?> updateFilm(@RequestParam(name = "aircraftId") Long id, @RequestBody Aircraft aircraft){
        aircraftService.updateAircraft(id, aircraft);
        return new ResponseEntity<>("Data berhasil diupdate", HttpStatus.OK);
    }
}
