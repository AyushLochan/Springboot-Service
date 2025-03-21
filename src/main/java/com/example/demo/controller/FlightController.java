package com.example.demo.controller;

import com.example.demo.Flight;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.service.FlightService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {
    FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> retrieveFlights() {
        return flightService.retrieveFlights();
    }

    @GetMapping("/{id}")
    public Flight retrieveFlightById(@PathVariable String id) {
        return flightService.retrieveFlightById(id);
    }

    @GetMapping("/{id}/schedules")
    public List<String> retrieveFlightSchedules(@PathVariable String id) {
        return flightService.getFlightSchedule(id);
    }
}
