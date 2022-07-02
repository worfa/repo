package com.hackathon.game.repository;

import com.hackathon.game.entity.Hero;
import com.hackathon.game.projection.heroProjection.HeroView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = HeroView.class, collectionResourceRel = "hero", path = "hero")
public interface HeroRepository extends JpaRepository<Hero, Long> {
}