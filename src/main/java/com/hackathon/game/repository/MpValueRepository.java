package com.hackathon.game.repository;

import com.hackathon.game.entity.MpValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MpValueRepository extends JpaRepository<MpValue, Long> {
}