package org.binar.kamihikoukiairlines.repository;

import org.binar.kamihikoukiairlines.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
