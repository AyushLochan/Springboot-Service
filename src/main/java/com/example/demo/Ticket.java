package com.example.demo;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private String id;
    private String flightId;
    private String name;
    private String emailAddress;
    private BigDecimal price;
    private boolean isCancelled;
}
