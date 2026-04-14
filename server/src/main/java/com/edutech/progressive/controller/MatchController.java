package com.edutech.progressive.controller;

import com.edutech.progressive.entity.Match;
import com.edutech.progressive.service.impl.MatchServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
@RestController @RequestMapping("/match")
public class MatchController {

    @Autowired
    MatchServiceImplJpa matchServiceImplJpa;
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches()  {
        // try {
        //     return new ResponseEntity<>(matchServiceImplJpa.getAllMatches(),HttpStatus.OK);
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        return null;
    }
    
    @GetMapping("/{matchId}")
    public ResponseEntity<Match> getMatchById(@PathVariable int matchId)  {
    //    try {
    //      return new ResponseEntity<>(matchServiceImplJpa.getMatchById(matchId),HttpStatus.OK);
    //    } catch (Exception e) {
    //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    //    }
    return null;
    }

   
    public ResponseEntity<Integer> addMatch(@RequestBody Match match)  {
        // try {
        //     return new ResponseEntity<>(matchServiceImplJpa.addMatch(match),HttpStatus.OK) ;
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        return null;
    }

    @PutMapping("/{matchId}")
    public ResponseEntity<Void> updateMatch(@PathVariable int matchId, Match match)   {
        // try {
        //     matchServiceImplJpa.updateMatch(match);
        //     return new ResponseEntity<>(HttpStatus.OK) ;
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        return null;
    }
    
    @DeleteMapping("/{matchId}")
    public ResponseEntity<Void> deleteMatch(@PathVariable int matchId)  {
        // try {
        //     matchServiceImplJpa.deleteMatch(matchId);
        //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        return null;
    }

    public ResponseEntity<List<Match>> getAllMatchesByStatus(String status) {
        // try {
        //     return new ResponseEntity<>(matchServiceImplJpa.getAllMatchesStatus(status),HttpStatus.OK);
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        return null;
    }
}