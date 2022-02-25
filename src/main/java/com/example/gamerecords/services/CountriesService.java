package com.example.gamerecords.services;


import com.example.gamerecords.dtos.response.CountriesListResponseDto;
import com.example.gamerecords.dtos.response.RecordsListResponseDto;
import com.example.gamerecords.models.Country;
import com.example.gamerecords.repositories.CountriesRepository;
import com.example.gamerecords.repositories.RecordsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class CountriesService {

    @Autowired
    private CountriesRepository countriesRepository;

    public CountriesListResponseDto getAll() {
        ArrayList<Country> countriesList = (ArrayList<Country>) countriesRepository.findAll();

        return new CountriesListResponseDto(countriesList);
    }
}
