package com.codeclan.labs.coursebookingsystem.repositories;

import com.codeclan.labs.coursebookingsystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
