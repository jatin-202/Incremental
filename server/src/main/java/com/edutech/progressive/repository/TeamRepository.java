package com.edutech.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutech.progressive.entity.Team;

public interface TeamRepository extends JpaRepository<Team,Integer> {

    public Team findByTeamId(int teamId);
    public void deleteByTeamId(int teamId);
    // public Integer findByTeamId(int teamId);

}