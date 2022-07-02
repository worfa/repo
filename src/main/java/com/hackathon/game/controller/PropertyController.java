package com.hackathon.game.controller;

import com.hackathon.game.model.MutablePropertyModel;
import com.hackathon.game.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService propertyService;

    @PostMapping(value = "/property", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void createComments(
            @RequestBody MutablePropertyModel mutablePropertyModel) {
        propertyService.create(mutablePropertyModel);
    }
}
