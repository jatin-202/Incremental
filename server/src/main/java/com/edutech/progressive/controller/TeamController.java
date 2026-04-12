package com.edutech.progressive.controller;

import com.edutech.progressive.entity.Team;
import com.edutech.progressive.service.impl.TeamServiceImplArraylist;
// import com.edutech.progressive.service.impl.TeamServiceImplArraylist;
import com.edutech.progressive.service.impl.TeamServiceImplJdbc;
import com.edutech.progressive.service.impl.TeamServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
@RestController @RequestMapping("/team")
public class TeamController {
    @Autowired
    TeamServiceImplArraylist teamServiceImplArraylist;
    @Autowired
    TeamServiceImplJdbc TeamServiceImplJdbc;
    public ResponseEntity<List<Team>> getAllTeams() {
        return null;
    }
    
    @GetMapping("/{teamId}")
    public ResponseEntity<Team> getTeamById(int teamId) throws SQLException {
        return new  ResponseEntity<>(TeamServiceImplJdbc.getTeamById(teamId),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<Integer> addTeam(Team team) throws SQLException {
        return new ResponseEntity<>(TeamServiceImplJdbc.addTeam(team),HttpStatus.OK);
    }
    @PutMapping("/{teamId}")
    public ResponseEntity<Void> updateTeam(int teamId, Team team) throws SQLException {
        return null;
    }

    @DeleteMapping("/{teamId}")
    public ResponseEntity<Void> deleteTeam(int teamId) throws SQLException {
        return null;
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Team>> getAllTeamsFromArrayList() {
        return new ResponseEntity<>(teamServiceImplArraylist.getAllTeams(),HttpStatus.OK); 
    }
    
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addTeamToArrayList(Team team) {
        return new ResponseEntity<>(teamServiceImplArraylist.addTeam(team),HttpStatus.CREATED) ;
    }
   
    @GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Team>> getAllTeamsSortedByNameFromArrayList() {
        return new ResponseEntity<>(teamServiceImplArraylist.getAllTeamsSortedByName(),HttpStatus.OK) ;
    }
}