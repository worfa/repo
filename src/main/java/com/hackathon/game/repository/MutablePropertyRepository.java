package com.hackathon.game.repository;

import com.hackathon.game.entity.MutableProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "property", path = "property")
public interface MutablePropertyRepository extends JpaRepository<MutableProperty, Long> {
}