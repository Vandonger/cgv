package com.onemount.cgv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_room")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "number_seat")
    private int numberSeat;

    @Column(name = "projector")
    private String projector;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;

    @Column(name = "status")
    private String status;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Ticket ticket;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "room_id")
    private List<Order> orders;
}
