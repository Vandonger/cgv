package com.onemount.cgv.dto;

import lombok.Data;

import java.util.List;
@Data
public class CinemaDTO {

    private Long id;

    private String name;

    private String location;

    private List<RoomDTO> roomDTOS;

    private List<EventDTO> eventDTOS;

    private String status;

    public CinemaDTO(String name, String location, List<RoomDTO> roomDTOS, List<EventDTO> eventDTOS, String status) {
        this.name = name;
        this.location = location;
        this.roomDTOS = roomDTOS;
        this.eventDTOS = eventDTOS;
        this.status = status;
    }

    public CinemaDTO() {

    }
}

