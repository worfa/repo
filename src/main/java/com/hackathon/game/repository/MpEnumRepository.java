package com.hackathon.game.repository;

import com.hackathon.game.entity.MpEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MpEnumRepository extends JpaRepository<MpEnum, Long> {
}