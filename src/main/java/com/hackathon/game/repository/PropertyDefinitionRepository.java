package com.hackathon.game.repository;

import com.hackathon.game.entity.PropertyDefinition;
import com.hackathon.game.projection.clusterProjection.PropertyDefinitionView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(excerptProjection = PropertyDefinitionView.class, collectionResourceRel = "definition", path = "definition")
public interface PropertyDefinitionRepository extends JpaRepository<PropertyDefinition, Long> {

    PropertyDefinition findTopByOrderByIdDesc();
}