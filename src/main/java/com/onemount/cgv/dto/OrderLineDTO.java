package com.onemount.cgv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineDTO {
    private Long id;

    private TicketDTO ticketDTO;

    private int seatNo;

    private OrderDTO orderDTO;
}

