package com.hackathon.game.repository;

import com.hackathon.game.entity.HeroClass;
import com.hackathon.game.entity.HeroGuild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface HeroGuildRepository extends JpaRepository<HeroGuild, Long> {
}