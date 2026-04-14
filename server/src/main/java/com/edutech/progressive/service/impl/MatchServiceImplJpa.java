package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Match;
import com.edutech.progressive.repository.MatchRepository;
import com.edutech.progressive.service.MatchService;
@Service
public class MatchServiceImplJpa implements MatchService {

     @Autowired
    MatchRepository matchRepository;
    
    public MatchServiceImplJpa(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
    List<Match> list = new ArrayList<>();
 

    public List<Match> getAllMatches() throws SQLException
    { 
        return matchRepository.findAll();  
    }
    public Integer addMatch(Match match)  throws SQLException
    {
        list.add(match);
        matchRepository.save(match);
        return match.getMatchId();
    }
    public Match getMatchById(int matchId)  throws SQLException
    {
        // return matchRepository.findByMatchId(matchId);
        return null;
        
    }
    public void updateMatch(Match match)  throws SQLException
    {
         Match match2 = matchRepository.findById(match.getMatchId()).get();
         match2.setFirstTeamId(match.getFirstTeamId());
         match2.setMatchDate(match.getMatchDate());
         match2.setMatchId(match.getMatchId());
         match2.setResult(match.getResult());
         match2.setSecondTeamId(match.getSecondTeamId());
         match2.setStatus(match.getStatus());
         match2.setWinnerTeamId(match.getWinnerTeamId());
    }
    public void deleteMatch(int matchId)  throws SQLException
    {
         matchRepository.deleteById(matchId);
    }
    public List<Match> getAllMatchesStatus(String status)  throws SQLException
    {
        //   return matchRepository.findAllByStatus(status);
        return null;
    }
    
   

}