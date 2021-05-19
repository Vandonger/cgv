package com.onemount.cgv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SeatDTO {
    private Long id;

    private int seatName;

    private RoomDTO roomDTO;

    private ReservationDTO reservationDTO;

    private String status;

}