package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Team;
import com.edutech.progressive.repository.TeamRepository;
import com.edutech.progressive.service.TeamService;
@Service
public class TeamServiceImplJpa implements TeamService {

    @Autowired
    TeamRepository teamRepository;
    
   
   List<Team> teams = new ArrayList<>();
    public TeamServiceImplJpa(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    List<Team> list = new ArrayList<>();
    public List<Team> getAllTeams() throws SQLException
    {
           return teamRepository.findAll();
    }
    public int addTeam(Team team) throws SQLException{
        Team newteam = teamRepository.save(team);
        return newteam.getTeamId();
        
        
    }
    public List<Team> getAllTeamsSortedByName() throws SQLException
    {
        List<Team> list1 = teamRepository.findAll();
        Collections.sort(list1);
        return list1;


    }

    public Team getTeamById(int teamId) throws SQLException{
       return teamRepository.findByTeamId(teamId);
    }

    public void updateTeam(int teamId ,Team team) throws SQLException
    {
        Team team1 =teamRepository.findByTeamId(teamId);
        if(team1 != null)
        {
        team1.setEstablishmentYear(team.getEstablishmentYear());
        team1.setLocation(team.getLocation());
        team1.setOwnerName(team.getOwnerName());
        team1.setTeamId(team.getTeamId());
        team1.setTeamName(team.getTeamName());
        teamRepository.save(team1);
        }
    }

    @Transactional
    public void deleteTeam(int teamId) throws SQLException
    {
        teamRepository.deleteByTeamId(teamId);

    }
    public void findById(int teamId) {
        teamRepository.findByTeamId(teamId);
        
    }
   

}