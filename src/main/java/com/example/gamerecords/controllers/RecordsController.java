package com.example.gamerecords.controllers;

import com.example.gamerecords.dtos.RecordResponseDto;
import com.example.gamerecords.services.RecordsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/records", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@AllArgsConstructor
public class RecordsController {

    @Autowired
    private RecordsService recordsService;

    @GetMapping(value = "/getAll")
    public ArrayList<RecordResponseDto> getAll() {
        return recordsService.getAll();
    }

    @GetMapping(value = "/getById/{id}")
    public RecordResponseDto getById(@PathVariable int id) {
        return recordsService.getById(id);
    }

    /*@DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        gunsService.deleteById(id);
    }*/

}
