package com.example.airline.airline.FlightController;

import com.example.airline.airline.entity.Flight;
import com.example.airline.airline.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flights/{source}/{destination}/{departureDateTime}")
    public List<Flight> getFlights(
            @PathVariable(required = false) String source,
            @PathVariable(required = false) String destination,
            @PathVariable(required = false) String departureDateTime) {
        return flightService.findFlights(source, destination, departureDateTime);
    }

    @GetMapping
    public List<Flight> getAll() {
        return flightService.findAll();
    }
}
