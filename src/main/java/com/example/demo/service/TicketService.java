package com.example.demo.service;

import com.example.demo.Ticket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    List<Ticket> tickets=new ArrayList<>();

    public List<Ticket> fetchAllTickets(){
        return tickets;
    }

    public Ticket fetchTicketById(String id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId().equals(id)) {
                return ticket;
            }
        }
        return null;
    }

    public Ticket addTicket(Ticket ticket) {
        if (ticket.getPrice() == null) {
            ticket.setPrice(new BigDecimal("0.00"));
        }
        tickets.add(ticket);
        return ticket;
    }

    public boolean cancelTicket(String id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId().equals(id)) {
                ticket.setCancelled(true);
                return true;
            }
        }
        return false;
    }
}
