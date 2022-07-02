package com.hackathon.game.repository;

import com.hackathon.game.entity.HeroClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface HeroClassRepository extends JpaRepository<HeroClass, Long> {
}