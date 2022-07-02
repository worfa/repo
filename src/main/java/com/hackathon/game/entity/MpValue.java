package com.hackathon.game.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "mp_values")
public class MpValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sqn", nullable = false)
    private Long id;

    @Column(name = "date_end")
    private LocalDate dateEnd;

    @Column(name = "date_begin")
    private LocalDate dateBegin;

    @Column(name = "actuality_flag")
    private Boolean actualityFlag;

    @Column(name = "sqn_source")
    private Long sqnSource;

    @Column(name = "date_time_value")
    private LocalDate dateTimeValue;

    @Column(name = "number_value")
    private Long numberValue;

    @Column(name = "string_value")
    private String stringValue;

    @Column(name = "sqn_enum_mp")
    private Long sqnEnumMp;
}