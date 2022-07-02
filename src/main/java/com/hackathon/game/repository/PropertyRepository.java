package com.hackathon.game.repository;

import com.hackathon.game.entity.Property;
import com.hackathon.game.projection.clusterProjection.PropertyView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = PropertyView.class ,collectionResourceRel = "property", path = "property")
public interface PropertyRepository extends JpaRepository<Property, Long> {
}