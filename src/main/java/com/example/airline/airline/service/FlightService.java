package com.example.airline.airline.service;

import com.example.airline.airline.entity.Flight;
import com.example.airline.airline.repo.FlightRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService {

    @Autowired
    private JPAStreamer jpaStreamer;

    @Autowired
    private FlightRepo repo;

    // Adjusted date-time format to "dd-MM-yyyy HH:mm"
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public List<Flight> findFlights(String source, String destination, String departureDateTime) {
        return jpaStreamer.stream(Flight.class)
                .filter(flight -> source == null || flight.getSource().equalsIgnoreCase(source))
                .filter(flight -> destination == null || flight.getDestination().equalsIgnoreCase(destination))
                .filter(flight -> departureDateTime == null || isDepartureDateMatching(flight, departureDateTime))
                .collect(Collectors.toList());
    }

    private boolean isDepartureDateMatching(Flight flight, String departureDateTime) {
        try {
            // Parse the flight's departure date-time with the adjusted format
            LocalDateTime flightDepartureTime = LocalDateTime.parse(flight.getDepartureDateTime(), DATE_TIME_FORMATTER);
            // Parse the input date-time with the same format
            LocalDateTime inputDateTime = LocalDateTime.parse(departureDateTime, DATE_TIME_FORMATTER);

            // Compare the dates (ignoring the time)
            return flightDepartureTime.toLocalDate().equals(inputDateTime.toLocalDate());
        } catch (Exception e) {
            // If the date format is incorrect, log the error and return false
            e.printStackTrace();
            return false;
        }
    }

    public List<Flight> findAll() {
        return repo.findAll();
    }
}
