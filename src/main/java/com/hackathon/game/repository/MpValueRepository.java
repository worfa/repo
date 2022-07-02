package com.hackathon.game.repository;

import com.hackathon.game.entity.MpValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "values", path = "values")
public interface MpValueRepository extends JpaRepository<MpValue, Long> {
}