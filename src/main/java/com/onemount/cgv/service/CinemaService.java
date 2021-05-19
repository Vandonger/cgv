package com.onemount.cgv.service;

import com.onemount.cgv.dto.CinemaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CinemaService {
    List<CinemaDTO> findAll();
}
