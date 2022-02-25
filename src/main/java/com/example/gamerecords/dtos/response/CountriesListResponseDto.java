package com.example.gamerecords.dtos.response;

import com.example.gamerecords.models.Country;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@AllArgsConstructor
@Data
public class CountriesListResponseDto {
    ArrayList<Country> countriesList;
}
