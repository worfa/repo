package com.hackathon.game.controller;

import com.hackathon.game.model.HeroClassModel;
import com.hackathon.game.model.HeroClusterModel;
import com.hackathon.game.model.HeroModel;
import com.hackathon.game.service.HeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.*;

@RepositoryRestController
@RequiredArgsConstructor
public class HeroController {

    private final HeroService heroService;

    @PostMapping(value = "/hero", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void create(
            @RequestBody HeroModel heroModel) {
        heroService.create(heroModel);
    }

//    @GetMapping(value = "/hero/{id}", produces = MediaTypes.HAL_JSON_VALUE)
//    public HeroClusterModel getHeroCluster(@PathVariable Long id) {
//        return heroService.getHeroCluster(id);
//    }
}
