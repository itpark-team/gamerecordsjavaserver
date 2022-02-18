package com.example.gamerecords.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "records")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    public String nickname;

    @Column
    public int score;

    @Column
    public String game;

    @Column(name = "unix_datetime")
    public long unixDateTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="country_id")
    public Country country;
}
