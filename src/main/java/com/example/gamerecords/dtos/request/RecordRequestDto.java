package com.example.gamerecords.dtos.request;

import lombok.Data;

@Data
public class RecordRequestDto {
    public String nickname;
    public int score;
    public String game;
    public long unixDateTime;
    public int countryId;
}
