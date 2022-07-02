package com.hackathon.game.controller;

import com.hackathon.game.model.ClusterModel;
import com.hackathon.game.model.HeroModel;
import com.hackathon.game.model.PropertyDefinitionModel;
import com.hackathon.game.model.PropertyModel;
import com.hackathon.game.projection.clusterViews.ClusterView;
import com.hackathon.game.service.ClusterService;
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
public class ClusterController {

    private final ClusterService clusterService;
    private final PropertyService propertyService;
    private final PropertyDefinitionService propertyDefinitionService;

    @PostMapping(value = "/cluster", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void create (
            @RequestBody ClusterModel clusterModel) {
        clusterService.create(clusterModel);
    }

    @PostMapping(value = "/cluster/{id}/properties", produces = MediaTypes.HAL_JSON_VALUE)
    @ResponseBody
    public void createClusterProperty(@RequestBody PropertyModel propertyModel, @PathVariable Long id) {
        propertyService.create(propertyModel, id);
    }


}