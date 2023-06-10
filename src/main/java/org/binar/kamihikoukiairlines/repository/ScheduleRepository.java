package org.binar.kamihikoukiairlines.repository;

import org.binar.kamihikoukiairlines.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
