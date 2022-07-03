package com.hackathon.game.repository;

import com.hackathon.game.entity.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RepositoryRestResource(collectionResourceRel = "value", path = "value")
public interface PropertyValueRepository extends JpaRepository<PropertyValue, Long> {
//
//
//    @RestResource(path = "byHeroIdAndBeginDateAndSourceChange", rel = "customFindMethod")
    @Query(value = "SELECT p FROM PropertyValue p WHERE p.hero.id = :heroId and p.dateBegin = :beginDate and " +
            "p.sourceOfChange.id = :sourceChangeId and p.actualityFlag = TRUE")
    List<PropertyValue> getByDateUserIdAndSourceChange(
            @Param("heroId") Long heroId,
            @Param("beginDate") LocalDate beginDate,
            @Param("sourceChangeId") Long sourceChangeId);
}