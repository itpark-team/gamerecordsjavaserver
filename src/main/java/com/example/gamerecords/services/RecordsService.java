package com.example.gamerecords.services;

import com.example.gamerecords.dtos.RecordResponseDto;
import com.example.gamerecords.models.Record;
import com.example.gamerecords.repositories.RecordsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RecordsService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RecordsRepository recordsRepository;

    public ArrayList<RecordResponseDto> getAll() {
        return (ArrayList<RecordResponseDto>) recordsRepository.findAll().stream().map(record -> modelMapper.map(record, RecordResponseDto.class)).collect(Collectors.toList());
    }

    public RecordResponseDto getById(int id){
        Record record = recordsRepository.findById(id).get();

        RecordResponseDto recordResponseDto = modelMapper.map(record, RecordResponseDto.class);

        return recordResponseDto;
    }
}
