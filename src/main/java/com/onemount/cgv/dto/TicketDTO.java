package com.onemount.cgv.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketDTO {
    private Long id;

    private FilmDTO filmDTO;

    private RoomDTO roomDTO;
    private OrderLineDTO user;

    private Date createdAt;
    private Date modifiedAt;

    private String status;
}
