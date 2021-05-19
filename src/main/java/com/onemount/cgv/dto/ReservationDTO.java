package com.onemount.cgv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReservationDTO {

    private Long id;

    private SeatDTO seatDTO;

    private long reservedTime; // timestamp
}