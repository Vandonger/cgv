package com.onemount.cgv.controller;

import com.onemount.cgv.dto.CinemaDTO;
import com.onemount.cgv.service.CinemaService;
import com.onemount.cgv.service.CinemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cinema")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping(value = "/")
    public ResponseEntity<List<CinemaDTO>> findAll() {
        return ResponseEntity.ok(cinemaService.findAll());
    }

}
