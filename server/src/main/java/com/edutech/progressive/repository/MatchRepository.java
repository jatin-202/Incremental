package com.edutech.progressive.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.edutech.progressive.entity.Match;

public interface MatchRepository extends JpaRepository<Match,Integer>{

    // public Match findByMatchId(int matchId);
    // public List<Match> findAllByStatus(String status);
    // @Modifying 
    // @Transactional
    // public void deleteByTeamId(int teamId);

}