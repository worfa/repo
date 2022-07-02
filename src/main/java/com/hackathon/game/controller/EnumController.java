package com.hackathon.game.controller;

import com.hackathon.game.model.HeroModel;
import com.hackathon.game.model.MpEnumModel;
import com.hackathon.game.service.EnumService;
import com.hackathon.game.service.HeroServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@RequiredArgsConstructor
public class EnumController {

    private final EnumService enumService;

    @PostMapping(value = "/enums", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void create(
            @RequestBody MpEnumModel mpEnumModel) {
        enumService.create(mpEnumModel);
    }
}
