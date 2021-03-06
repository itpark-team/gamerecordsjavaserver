package com.example.gamerecords.services;

import com.example.gamerecords.dtos.request.RecordRequestDto;
import com.example.gamerecords.dtos.response.RecordResponseDto;
import com.example.gamerecords.dtos.response.RecordsListResponseDto;
import com.example.gamerecords.models.Record;
import com.example.gamerecords.repositories.RecordsRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
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

    public RecordsListResponseDto getAll() {
        ArrayList<RecordResponseDto> recordsList = (ArrayList<RecordResponseDto>) recordsRepository.findAll().stream().map(record -> modelMapper.map(record, RecordResponseDto.class)).collect(Collectors.toList());

        return new RecordsListResponseDto(recordsList);
    }

    public RecordResponseDto getById(int id) {
        Record record = recordsRepository.findById(id).get();

        RecordResponseDto recordResponseDto = modelMapper.map(record, RecordResponseDto.class);

        return recordResponseDto;
    }

    public void deleteById(int id) {
        recordsRepository.deleteById(id);
    }

    public void insertOne(RecordRequestDto recordRequestDto){
        Record record = modelMapper.map(recordRequestDto, Record.class);

        recordsRepository.saveAndFlush(record);
    }

    public void updateById(int id, RecordRequestDto recordRequestDto){

        Record record = modelMapper.map(recordRequestDto, Record.class);
        record.id = id;

        recordsRepository.save(record);
    }
}
