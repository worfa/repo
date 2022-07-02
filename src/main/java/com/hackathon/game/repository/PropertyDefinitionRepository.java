package com.hackathon.game.repository;

import com.hackathon.game.entity.PropertyDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "definition", path = "definition")
public interface PropertyDefinitionRepository extends JpaRepository<PropertyDefinition, Long> {
}