package com.example.gamerecords.repositories;

import com.example.gamerecords.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordsRepository extends JpaRepository<Record, Integer> {

}
