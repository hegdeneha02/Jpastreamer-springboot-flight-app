package com.example.airline.airline.repo;

import com.example.airline.airline.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight,Integer> {
    Flight findById(int id);
}
