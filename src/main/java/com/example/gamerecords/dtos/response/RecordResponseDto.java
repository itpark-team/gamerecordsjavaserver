package com.example.gamerecords.dtos.response;

import com.example.gamerecords.models.Country;
import lombok.Data;

@Data
public class RecordResponseDto {
    public int id;
    public String nickname;
    public int score;
    public String game;
    public long unixDateTime;
    public String countryName;
}
