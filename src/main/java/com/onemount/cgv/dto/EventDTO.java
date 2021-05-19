package com.onemount.cgv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventDTO {
    private Long id;

    private String name;

    public Date startDate;

    public Date endDate;

    private List<CinemaDTO> cinemaDTOs;

    private List<FilmDTO> filmDTOS;

    private int status;

}
