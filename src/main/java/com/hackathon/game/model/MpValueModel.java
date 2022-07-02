package com.hackathon.game.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MpValueModel {

    private LocalDate dateEnd;

    private LocalDate dateBegin;

    private Boolean actualityFlag;

    private LocalDate dateTimeValue;

    private Long numberValue;

    private String stringValue;

    private Long idSource;

    private Long idEnumMp;

    private Long idUser;

    private Long idMutProp;

    private Long idSourceOfChange;
}