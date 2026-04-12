package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.edutech.progressive.entity.Team;
import com.edutech.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService {
    private List<Team> teams = new ArrayList<>();

    @Override
    public List<Team> getAllTeams() {
        return teams;
    }

    @Override
    public int addTeam(Team team) {

        // prevent duplicate teamId
        for (Team t : teams) {
            if (t.getTeamId() == team.getTeamId()) {
                return -1;
            }
        }

        teams.add(team);
        return 1;
    }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        List<Team> sortedList = new ArrayList<>(teams);

        sortedList.sort(Comparator.comparing(Team::getTeamName));

        return sortedList;
    }

    @Override
    public void emptyArrayList() {
        teams.clear();
    }

}
