package com.hackathon.game.controller;

import com.hackathon.game.model.PropertyDefinitionModel;
import com.hackathon.game.model.PropertyModel;
import com.hackathon.game.service.PropertyDefinitionService;
import com.hackathon.game.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService propertyService;
    private final PropertyDefinitionService propertyDefinitionService;

    @PostMapping(value = "/property", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void createComments(
            @RequestBody PropertyModel propertyModel) {
        propertyService.create(propertyModel);
    }

    @PostMapping(value = "/property/{id}/definition", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public Long createPropertyDefinition(@RequestBody PropertyDefinitionModel propertyDefinitionModel,
                                                        @PathVariable Long id) {
        return propertyDefinitionService.create(propertyDefinitionModel, id);
    }
}
