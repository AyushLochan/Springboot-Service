package com.example.demo.controller;

import com.example.demo.Ticket;
import com.example.demo.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> fetchAllTickets() {
        return ticketService.fetchAllTickets();
    }

    @GetMapping("/{id}")
    public Ticket fetchTicketById(@PathVariable String id) {
        return ticketService.fetchTicketById(id);
    }

    @PostMapping
    public Ticket addTicket(@RequestBody Ticket ticket) {
        if (ticket.getPrice() == null) {
            ticket.setPrice(new BigDecimal("0.00"));
        }
        return ticketService.addTicket(ticket);
    }

    @DeleteMapping("/{id}")
    public String cancelTicket(@PathVariable String id) {
        return ticketService.cancelTicket(id) ? "Successful Ticket Cancellation" : "Ticket not found";
    }
}
