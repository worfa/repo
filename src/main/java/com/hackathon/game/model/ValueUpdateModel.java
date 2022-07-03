package com.hackathon.game.model;

import lombok.Data;

import java.util.List;

@Data
public class ValueUpdateModel {

    private Long sourceOfChangesId;

    private List<PropertyValueModel> propertyValueModels;
}
