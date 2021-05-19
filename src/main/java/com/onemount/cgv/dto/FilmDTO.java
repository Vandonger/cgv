package com.onemount.cgv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FilmDTO {
    private Long id;

    private String name;

    private String director;

    private String cast;

    private String genre;

    private Date releaseDate;

    private int runningTime;

    private String language;

    private String thumbnailUrl;

    private String description;

    private String slug;

    private List<EventDTO> eventDTOS;

    private int status;

    private TicketDTO ticketDTO;
}