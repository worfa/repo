package com.hackathon.game.controller;

import com.hackathon.game.model.PropertyValueModel;
import com.hackathon.game.service.PropertyValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@RequiredArgsConstructor
public class PropertyValueController {

    private final PropertyValueService mpValueService;

    @PostMapping(value = "/value", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void create(
            @RequestBody PropertyValueModel mpValueModel) {
        mpValueService.create(mpValueModel);
    }
}
