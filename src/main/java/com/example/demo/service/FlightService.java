package com.example.demo.service;

import com.example.demo.Flight;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {
    List<Flight> flights=new ArrayList<>();

    FlightService(){
        flights.add(new Flight("1", "AA100", "Bangalore", "Nagpur", "9:00 AM", "12:00 PM", "SpiceJet", List.of("20-02-2025", "20-02-2025"), 100, "2 checked bags"));
        flights.add(new Flight("2", "AA200", "Kolkata", "Mumbai", "2:00 PM", "5:00 PM", "Air India", List.of("15-03-2025", "15-03-2025"), 150, "2 checked bags"));
        flights.add(new Flight("3", "AA300", "Kolkata", "Chennai", "4:00 PM", "8:00 PM", "Indigo", List.of("5-03-2025", "5-03-2025"), 130, "2 checked bags"));
    }

    public List<Flight> retrieveFlights() {
        return flights;
    }

    public Flight retrieveFlightById(String id) {
        for (Flight flight : flights) {
            if (flight.getId().equals(id)) {
                return flight;
            }
        }
        return null;
    }

    public List<String> getFlightSchedule(String id) {
        Flight flight = retrieveFlightById(id);
        if (flight != null) {
            List<String> schedules = new ArrayList<>();
            schedules.addAll(flight.getSchedules());
            return schedules;
        }
        return null;
    }
}
