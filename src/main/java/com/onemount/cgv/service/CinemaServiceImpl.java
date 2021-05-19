package com.onemount.cgv.service;

import com.onemount.cgv.dto.CinemaDTO;
import com.onemount.cgv.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService{

    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public List<CinemaDTO> findAll() {
        return null;
    }
}
