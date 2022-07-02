package com.hackathon.game.repository;

import com.hackathon.game.entity.MpEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "enums", path = "enums")
public interface MpEnumRepository extends JpaRepository<MpEnum, Long> {
}