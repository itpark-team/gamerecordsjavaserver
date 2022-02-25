package com.example.gamerecords.controllers;

import com.example.gamerecords.dtos.response.CountriesListResponseDto;
import com.example.gamerecords.dtos.response.RecordsListResponseDto;
import com.example.gamerecords.services.CountriesService;
import com.example.gamerecords.services.RecordsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/countries", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@AllArgsConstructor
public class CountriesController {

    @Autowired
    private CountriesService countriesService;

    @GetMapping(value = "/getAll")
    public CountriesListResponseDto getAll() {
        return countriesService.getAll();
    }
}
