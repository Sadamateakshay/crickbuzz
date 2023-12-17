package com.crick.api.repositories;

import com.crick.api.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<Match,Integer> {

    //fetch match
    //provide->teamHeading


    Optional<Match> findByTeamHeading(String teamHeading);
}
