package com.example.gamerecords.repositories;

import com.example.gamerecords.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Country, Integer> {
}
