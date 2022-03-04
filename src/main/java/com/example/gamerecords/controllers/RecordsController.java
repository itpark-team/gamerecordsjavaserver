package com.example.gamerecords.controllers;

import com.example.gamerecords.dtos.request.RecordRequestDto;
import com.example.gamerecords.dtos.response.RecordsListResponseDto;
import com.example.gamerecords.dtos.response.RecordResponseDto;
import com.example.gamerecords.services.RecordsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/records", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@AllArgsConstructor
public class RecordsController {

    @Autowired
    private RecordsService recordsService;

    @GetMapping(value = "/getAll")
    public RecordsListResponseDto getAll() {
        return recordsService.getAll();
    }

    @GetMapping(value = "/getById/{id}")
    public RecordResponseDto getById(@PathVariable int id) {
        return recordsService.getById(id);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        recordsService.deleteById(id);
    }

    @PostMapping(value = "/insertOne")
    public void insertOne(@RequestBody RecordRequestDto recordRequestDto) {
        recordsService.insertOne(recordRequestDto);
    }

    @PutMapping(value = "/updateById/{id}")
    public void updateById(@PathVariable int id, @RequestBody RecordRequestDto recordRequestDto) {
        recordsService.updateById(id, recordRequestDto);
    }
}
