
package com.edutech.progressive.service.impl;

import com.edutech.progressive.entity.Cricketer;
import com.edutech.progressive.entity.Team;
import com.edutech.progressive.exception.TeamCricketerLimitExceededException;
import com.edutech.progressive.repository.CricketerRepository;
import com.edutech.progressive.repository.TeamRepository;
import com.edutech.progressive.repository.VoteRepository;
import com.edutech.progressive.service.CricketerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

@Service
public class CricketerServiceImplJpa implements CricketerService {

    private CricketerRepository cricketerRepository;

    @Autowired
    VoteRepository voteRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    public CricketerServiceImplJpa(CricketerRepository cricketerRepository) {
        this.cricketerRepository = cricketerRepository;
    }

    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        List<Cricketer> list = cricketerRepository.findAll();

        for (Cricketer c : list) {
            if (c.getTeam() == null) {
                Team t = new Team();
                t.setTeamId(0);
                t.setTeamName("No Team");
                c.setTeam(t);
            }
        }

        return list;
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) throws TeamCricketerLimitExceededException {

        // ✅ ADD THIS BLOCK (DO NOT CHANGE YOUR LOGIC)
        int teamId = cricketer.getTeam().getTeamId();
        Team team = teamRepository.findById(teamId)
                .orElseThrow(() -> new RuntimeException("Team not found"));

        cricketer.setTeam(team); // ✅ attach real entity

        // ✅ YOUR ORIGINAL LOGIC (UNCHANGED)
        Long totalCricketersInTeam = cricketerRepository.countByTeam_TeamId(teamId);

        if (totalCricketersInTeam == 11) {
            throw new TeamCricketerLimitExceededException(
                    "Team = " + teamId + " already has reached its maximum limit of 11 cricketers");
        }

        return cricketerRepository.save(cricketer).getCricketerId();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        List<Cricketer> sortedCricketer = cricketerRepository.findAll();
        sortedCricketer.sort(Comparator.comparing(Cricketer::getExperience));
        return sortedCricketer;
    }

    @Override
    public void updateCricketer(Cricketer cricketer) throws SQLException {

        // ✅ attach real team entity (ONLY FIX)
        int teamId = cricketer.getTeam().getTeamId();
        Team team = teamRepository.findById(teamId)
                .orElseThrow(() -> new RuntimeException("Team not found"));

        cricketer.setTeam(team);

        // ✅ YOUR ORIGINAL SAVE
        cricketerRepository.save(cricketer);
    }

    @Override
    public void deleteCricketer(int cricketerId) throws SQLException {
        voteRepository.deleteByCricketerId(cricketerId);
        cricketerRepository.deleteById(cricketerId);
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) throws SQLException {
        return cricketerRepository.findByCricketerId(cricketerId);
    }

    @Override
    public List<Cricketer> getCricketersByTeam(int teamId) throws SQLException {
        return cricketerRepository.findByTeam_TeamId(teamId);
    }
}