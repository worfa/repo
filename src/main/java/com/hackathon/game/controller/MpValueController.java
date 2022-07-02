package com.hackathon.game.controller;

import com.hackathon.game.model.MpValueModel;
import com.hackathon.game.service.MpValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@RequiredArgsConstructor
public class MpValueController {

    private final MpValueService mpValueService;

    @PostMapping(value = "/values", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void create(
            @RequestBody MpValueModel mpValueModel) {
        mpValueService.create(mpValueModel);
    }
}
