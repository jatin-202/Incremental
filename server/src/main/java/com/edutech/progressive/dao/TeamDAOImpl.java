package com.edutech.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Team;

public class TeamDAOImpl implements TeamDAO {

    @Override
    public int addTeam(Team team) {
        return -1;
    }

    @Override
    public Team getTeamById(int teamId) {
        return null;
    }

    @Override
    public void updateTeam(Team team) {
        // do nothing
    }

    @Override
    public void deleteTeam(int teamId) {
        // do nothing
    }

    @Override
    public List<Team> getAllTeams() {
        return new ArrayList<>();
    }
}