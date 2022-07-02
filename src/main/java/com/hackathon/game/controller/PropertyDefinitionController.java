package com.hackathon.game.controller;

import com.hackathon.game.model.PropertyDefinitionModel;
import com.hackathon.game.service.PropertyDefinitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@RequiredArgsConstructor
public class PropertyDefinitionController {

    private final PropertyDefinitionService propertyDefinitionService;

    @PostMapping(value = "/definition", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public Long create(
            @RequestBody PropertyDefinitionModel propertyDefinitionModel) {
       return propertyDefinitionService.create(propertyDefinitionModel);
    }
}
