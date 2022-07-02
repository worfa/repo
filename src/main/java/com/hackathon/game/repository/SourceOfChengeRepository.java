package com.hackathon.game.repository;

import com.hackathon.game.entity.SourceOfChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public interface SourceOfChengeRepository extends JpaRepository<SourceOfChange, Long> {
}