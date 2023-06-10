package org.binar.kamihikoukiairlines.repository;

import org.binar.kamihikoukiairlines.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
}
