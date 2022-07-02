package com.hackathon.game.repository;

import com.hackathon.game.entity.SourceOfChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceOfChangeRepository extends JpaRepository<SourceOfChange, Long> {
}