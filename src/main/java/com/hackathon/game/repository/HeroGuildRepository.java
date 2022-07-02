package com.hackathon.game.repository;

import com.hackathon.game.entity.HeroGuild;
import com.hackathon.game.projection.heroProjection.HeroGuildView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(excerptProjection = HeroGuildView.class)
public interface HeroGuildRepository extends JpaRepository<HeroGuild, Long> {
}